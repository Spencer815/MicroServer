package com.spencer.dao;

import com.spencer.model.Menu;

/**
 * @author lichao
 * @date 2018/12/3
 **/
public interface MenuMapper {
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
    int insert(Menu record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Menu record);

    /**
     *
     * @param id
     * @return
     */
    Menu selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Menu record);
}