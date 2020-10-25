package com.home.common.dao;

import com.home.common.exception.HomeException;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface BaseDao<T> extends Mapper<T>, ConditionMapper<T>, MySqlMapper<T> {

    default int updateOneByCondition(T model, Condition condition) {
        List<T> selectedList = selectByCondition(condition);
        if (null == selectedList || selectedList.size() > 1) {
            throw new HomeException("更新数量为1，查询数量大于1，请检查数据!");
        }
        return updateByConditionSelective(model, condition);
    }

    default int updateOneByExample(T model, Example example) {
        List<T> selectedModelList = selectByExample(example);
        if (null != selectedModelList && selectedModelList.size() > 1) {
            // 如果根据条件查询出的数据条数不止一条，报错
            throw new HomeException("更新数量指定为1，但是根据条件查询数量大于一，请联系人员检查数据");
        }
        // 此处为非强制更新，null值不会更新
        return updateByExampleSelective(model, example);
    }

    default int forceUpdateOneByExample(T model, Example example) {
        List<T> selectedModelList = selectByExample(example);
        if (null != selectedModelList && selectedModelList.size() > 1) {
            // 如果根据条件查询出的数据条数不止一条，报错
            throw new HomeException("更新数量指定为1，但是根据条件查询数量大于一，请联系人员检查数据");
        }
        // 此处为强制更新，null值会更新
        return updateByExample(model, example);
    }

    default int forceUpdateOneByCondition(T model, Condition condition) {
        List<T> selectedModelList = selectByCondition(condition);
        if (null != selectedModelList && selectedModelList.size() > 1) {
            // 如果根据条件查询出的数据条数不止一条，报错
            throw new HomeException("更新数量指定为1，但是根据条件查询数量大于一，请联系人员检查数据");
        }
        // 此处为强制更新，null也会更新
        return updateByCondition(model, condition);
    }

}
