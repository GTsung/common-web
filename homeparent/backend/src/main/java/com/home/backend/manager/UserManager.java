package com.home.backend.manager;

import com.home.backend.common.BaseManager;
import com.home.backend.dao.UserDao;
import com.home.backend.domain.SysUserDO;
import com.home.backend.enums.DelFlagEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Component
public class UserManager extends BaseManager<SysUserDO> {

    @Autowired
    private UserDao userDao;

    public List<SysUserDO> getAll() {
        Example example = new Example(SysUserDO.class);
        example.and().andEqualTo("delFlag", DelFlagEnum.PERSISTENT.getCode());
        return userDao.selectByExample(example);
    }
}
