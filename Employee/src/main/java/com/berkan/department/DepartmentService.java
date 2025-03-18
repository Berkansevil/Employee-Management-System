package com.berkan.department;

import com.berkan.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {
    private List<Employee> employeeList;
    private List<Department> departmentList;

    public DepartmentService() {
        employeeList = new ArrayList<>();
        departmentList=new ArrayList<>();
    }

    public Department createDepartment(Department department) {
        Department newDepartment = new Department();
        newDepartment.setDepartmentID(department.getDepartmentID());
        newDepartment.setDepartmentName(department.getDepartmentName());
        newDepartment.setSalaryFactory(department.getSalaryFactory());
        departmentList.add(newDepartment);
        return newDepartment;
    }

    public String deleteDepartment(long departmentID) {
        if (departmentList.isEmpty()) {
            return "Department list is empty";
        }
      departmentList.removeIf(department -> department.getDepartmentID() == departmentID);
      return "Department deleted successfully";
    }

    public List<Department> getDepartmentList() {
        System.out.printf("%-15s %-20s %-15s%n", "Department ID", "Department Name", "Salary Factor");
        System.out.println("---------------------------------------------------------------");

        for (Department department : departmentList) {
            System.out.printf("%-15d %-20s %-15.2f%n",
                    department.getDepartmentID(),
                    department.getDepartmentName(),
                    department.getSalaryFactory());
        }
        return departmentList;
    }

}
