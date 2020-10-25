package com.home.common.manager;

import com.home.common.dao.BaseDao;
import com.home.common.domain.BaseDO;
import com.home.common.enums.DelFlagEnum;
import com.home.common.util.AssertUtil;
import com.home.common.util.UserUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
public class BaseManager<T extends BaseDO> {

    @Autowired
    private BaseDao<T> dao;

    private Class clz;


    public BaseManager() {
        Type[] clzs = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
        AssertUtil.assertTrue(null != clzs && clzs.length == 1, "泛型参数传入异常");
        clz = (Class) clzs[0];
    }

    public int save(T model) {
        String operator = getOperator(model.getCreateUser());
        return this.save(model, operator);
    }


    public int save(T model, String operator) {
        if (null == model) {
            return 0;
        }
        model.setDelFlag(DelFlagEnum.PERSISTENT.getCode());
        model.setCreateTime(new Date());
        model.setCreateUser(operator);
        model.setUpdateTime(new Date());
        model.setUpdateUser(operator);
        return dao.insertSelective(model);
    }

    public int save(List<T> models) {
        if (CollectionUtils.isEmpty(models)) {
            return 0;
        }
        for (T model : models) {
            model.setDelFlag(DelFlagEnum.PERSISTENT.getCode());
            model.setCreateTime(new Date());
            model.setCreateUser(UserUtil.getCombName());
            model.setUpdateUser(UserUtil.getCombName());
            model.setUpdateTime(new Date());
        }
        return dao.insertList(models);
    }

    private String getOperator(String operator) {
        // 操作人取值优先级 session > model.userField > default
        return UserUtil.DEFAULT_USER.equalsIgnoreCase(UserUtil.getCombName())
                ? Optional.ofNullable(operator).orElse(UserUtil.getCombName())
                : UserUtil.getCombName();
    }
}
