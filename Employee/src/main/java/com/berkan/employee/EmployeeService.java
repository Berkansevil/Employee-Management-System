package com.berkan.employee;

import com.berkan.department.Department;
import com.berkan.role.Role;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
       employees=new ArrayList<>();
    }

    public Employee createEmployee(Employee employee, Department department, Role role) {
        employee.setEmployeeName(employee.getEmployeeName());
        employee.setEmployeeSurname(employee.getEmployeeSurname());
        employee.setDepartment(department);
        employee.setRole(role);
        employee.setEmployeeAge(employee.getEmployeeAge());
        employee.setJoiningDate(employee.getJoiningDate());
        employee.setEmployeeAddress(employee.getEmployeeAddress());
        employees.add(employee);
        return employee;
    }

    public String deleteEmployee(long employeeId) {
        boolean removed = employees.removeIf(e -> e.getEmployeeID() == employeeId);
        if (removed) {
            System.out.println("Employee deleted successfully");
            return "Employee deleted";
        }
        return "Employee not found";
    }
    public List<Employee> getEmployees() {
        System.out.printf("%-10s %-15s %-15s %-5s %-15s %-20s %-30s%n",
                "ID", "Name", "Surname", "Age", "Role", "Department", "Joining Date");
        System.out.println("------------------------------------------------------------------------------------------------");

        for (Employee e : employees) {
            System.out.printf("%-10d %-15s %-15s %-5d %-15s %-20s %-30s%n",
                    e.getEmployeeID(),
                    e.getEmployeeName(),
                    e.getEmployeeSurname(),
                    e.getEmployeeAge(),
                    e.getRole().getRoleName(),
                    e.getDepartment().getDepartmentName(),
                    e.getJoiningDate().toString());
        }
        return employees;
    }
}
