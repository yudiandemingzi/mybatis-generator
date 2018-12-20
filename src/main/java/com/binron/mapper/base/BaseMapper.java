package com.binron.mapper.base;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

/**
 * @author 基础的Mapper 所有业务表都继承之该mapper
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
    /**
     * 通过主键删除
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入对象
     */
    int insert(T record);

    /**
     * 通过K 查找对象
     */
    T selectByPrimaryKey(String id);

    /**
     * 查找所有
     */
    List<T> selectAll();

    /**
     * 更新 对象
     */
    int updateByPrimaryKey(T record);

}
