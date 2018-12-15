package com.spencer.model.dao;

import com.spencer.model.pojo.Dict;

/**
 * @author lichao
 * @date 2018/12/3
 **/
public interface DictMapper {
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
    int insert(Dict record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Dict record);

    /**
     *
     * @param id
     * @return
     */
    Dict selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Dict record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Dict record);
}