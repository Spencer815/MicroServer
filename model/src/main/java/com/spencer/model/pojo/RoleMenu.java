package com.spencer.model.pojo;

/**
 * @author lichao
 * @date 2018/12/3
 **/
public class RoleMenu {
    private Integer roleId;
    private Integer menuId;

    public RoleMenu(Integer roleId, Integer menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

    public RoleMenu() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}