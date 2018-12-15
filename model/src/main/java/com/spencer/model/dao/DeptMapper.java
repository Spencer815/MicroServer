package com.spencer.model.dao;

import com.spencer.model.pojo.Dept;

/**
 * @author lichao
 * @date 2018/12/3
 **/
public interface DeptMapper {
    /**
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int insert(Dept record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Dept record);

    /**
     *
     * @param id
     * @return
     */
    Dept selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Dept record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Dept record);
}