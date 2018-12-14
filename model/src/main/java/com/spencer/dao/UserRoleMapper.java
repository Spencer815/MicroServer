package com.spencer.dao;

import com.spencer.model.UserRole;

/**
 * @author lichao
 * @date 2018/12/3
 **/
public interface UserRoleMapper {
    /**
     * @param record
     * @return
     */
    int insert(UserRole record);

    /**
     * @param record
     * @return
     */
    int insertSelective(UserRole record);
}