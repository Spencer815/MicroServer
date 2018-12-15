package com.spencer.model.pojo;

import java.util.Date;

/**
 * 组织结构实体类
 *
 * @author lichao
 * @date 2018/12/3
 **/
public class Dept {
    private Integer id;

    private String code;

    private String name;

    private String node;

    private String parentCode;

    private Boolean state;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public Dept(Integer id, String code, String name, String node, String parentCode, Boolean state, Date createdAt, Date updatedAt, Date deletedAt) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.node = node;
        this.parentCode = parentCode;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Dept() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node == null ? null : node.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}