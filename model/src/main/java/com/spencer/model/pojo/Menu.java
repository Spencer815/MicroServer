package com.spencer.model.pojo;

import java.util.Date;

/**
 * 菜单实体类
 *
 * @author lichao
 * @date 2018/12/3
 **/
public class Menu {
    private Integer id;

    private String code;

    private String name;

    private String icon;

    private Integer pId;

    private Integer order;

    private String url;

    private Boolean state;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    public Menu(Integer id, String code, String name, String icon, Integer pId, Integer order, String url, Boolean state, Date createdAt, Date updatedAt, Date deletedAt) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.icon = icon;
        this.pId = pId;
        this.order = order;
        this.url = url;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Menu() {
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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