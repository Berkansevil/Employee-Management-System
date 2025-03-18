package com.berkan.department;

public class Department {
    private static int idCounter=0;
    private  long departmentID;
    private String departmentName;
    private double salaryFactory;


    public Department(long departmentID, String departmentName, double salaryFactory) {
        this.departmentID = ++idCounter;
        this.departmentName = departmentName;
        this.salaryFactory = salaryFactory;
    }
    public Department() {
        this.departmentID = ++idCounter;
    }

    public long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(long departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalaryFactory() {
        return salaryFactory;
    }

    public void setSalaryFactory(double salaryFactory) {
        this.salaryFactory = salaryFactory;
    }
}
