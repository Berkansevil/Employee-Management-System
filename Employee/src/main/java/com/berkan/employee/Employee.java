package com.berkan.employee;

import com.berkan.department.Department;
import com.berkan.role.Role;

import java.time.LocalDate;

public class Employee {
    private static int idCounter=0;
    private long EmployeeID;
    private String EmployeeName;
    private String EmployeeSurname;
    private String EmployeeAddress;
    private int EmployeeAge;
    private LocalDate joiningDate;
    private Department department;
    private Role role;


    public Employee( String employeeName, String employeeSurname, String employeeAddress,
                     int employeeAge, LocalDate joiningDate,Department department, Role role) {
        this.EmployeeID = ++idCounter;
        this.EmployeeName = employeeName;
        this.EmployeeSurname = employeeSurname;
        this.EmployeeAddress = employeeAddress;
        this.EmployeeAge = employeeAge;
        this.joiningDate = joiningDate;
        this.department = department;
        this.role = role;
    }

    public Employee() {
        this.EmployeeID = ++idCounter;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public long getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(long employeeID) {
        EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        EmployeeAddress = employeeAddress;
    }

    public String getEmployeeSurname() {
        return EmployeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        EmployeeSurname = employeeSurname;
    }

    public int getEmployeeAge() {
        return EmployeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        EmployeeAge = employeeAge;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }
}
