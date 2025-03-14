package com.berkan.department;

import com.berkan.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {
    private List<Employee> employeeList;

    public DepartmentService() {
        employeeList = new ArrayList<Employee>();
    }
}
