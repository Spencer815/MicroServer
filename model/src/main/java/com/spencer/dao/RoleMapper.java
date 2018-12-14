package com.spencer.dao;

import com.spencer.model.Role;

/**
 * @author lichao
 * @date 2018/12/3
 **/
public interface RoleMapper {
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
    int insert(Role record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Role record);

    /**
     *
     * @param id
     * @return
     */
    Role selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Role record);
}