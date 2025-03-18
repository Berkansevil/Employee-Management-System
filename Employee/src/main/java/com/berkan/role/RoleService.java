package com.berkan.role;

import com.berkan.department.Department;

import java.util.ArrayList;
import java.util.List;

public class RoleService {
    private Department department;
    private List<Role> roleList;

    public RoleService() {
        roleList = new ArrayList<>();
    }


    public Role createRole(Role role) {
        role.setRoleName(role.getRoleName());
        role.setDepartment(department);
        role.setLevel(role.getLevel() );
        roleList.add(role);
        return role;
    }

    public List<Role> getRoleList() {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Role ID", "Role Name", "Level", "Department");
        System.out.println("---------------------------------------------------------");

        for (Role role : roleList) {
            System.out.printf("%-10d %-10s %-10d %-15s%n",
                    role.getRoleId(),
                    role.getRoleName(),
                    role.getLevel(),
                    role.getDepartment().getDepartmentName());

        }
        return roleList;
    }

    public String deleteRole(int roleId) {
        if(roleList.isEmpty()) {
            return "Role List is empty";
        }
        roleList.removeIf(role-> role.getRoleId()==roleId );
        System.out.println("Delete Role Success");
        return "Role deleted";
    }

}
