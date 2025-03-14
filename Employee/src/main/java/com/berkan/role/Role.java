package com.berkan.role;

import com.berkan.department.Department;

public class Role {
    private long roleId=0;
    private String roleName;
    private int level;
    private Department department;

    public Role(long roleId, String roleName, int level,Department department) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.level = level;
        this.department = department;
    }

    public Role(){
        roleId+=1;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

   public int getLevel() {
        return level;
   }
   public void setLevel(int level) {
        this.level = level;
   }
   public Department getDepartment() {
        return department;
   }
   public void setDepartment(Department department) {
        this.department = department;
   }
}
