package com.berkan.role;

import com.berkan.department.Department;

public class Role {
    private  static int idCounter=0;
    private long roleId;
    private String roleName;
    private int level;
    private Department department;

    public Role( String roleName, int level,Department department) {
        this.roleId = ++idCounter;
        this.roleName = roleName;
        this.level = level;
        this.department = department;
    }

    public Role(){
        this.roleId = ++idCounter;
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
