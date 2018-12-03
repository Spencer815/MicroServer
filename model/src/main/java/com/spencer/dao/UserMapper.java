package com.spencer.dao;

import com.spencer.model.User;

/**
 * @author lichao
 * @date 2018/12/3
 **/
public interface UserMapper {
    /**
     * 删除用户
     *
     * @param id id
     * @return 1 成功   0 失败
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @param record user
     * @return
     */
    int insert(User record);

    /**
     *
     * @param record user
     * @return
     */
    int insertSelective(User record);

    /**
     *
     * @param id id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @param record user
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @param record user
     * @return
     */
    int updateByPrimaryKey(User record);
}