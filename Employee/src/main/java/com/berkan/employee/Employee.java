package com.berkan.employee;

import java.time.LocalDate;

public class Employee {
    private long EmployeeID=0;
    private String EmployeeName;
    private String EmployeeSurname;
    private String EmployeeAddress;
    private int EmployeeAge;
    private LocalDate joiningDate;

    public Employee(long employeeID, String employeeName, String employeeSurname, String employeeAddress,
                    int employeeAge, LocalDate joiningDate) {
        this.EmployeeID = employeeID;
        this.EmployeeName = employeeName;
        this.EmployeeSurname = employeeSurname;
        this.EmployeeAddress = employeeAddress;
        this.EmployeeAge = employeeAge;
        this.joiningDate = joiningDate;
    }

    public Employee(long employeeID) {
    employeeID = employeeID+1;
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
