package com.berkan.department;

public class Department {
    private  long departmentID=0;
    private String departmentName;
    private long salaryFactory;


    public Department(long departmentID, String departmentName, long salaryFactory) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.salaryFactory = salaryFactory;
    }
    public Department() {
        departmentID +=1;
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

    public long getSalaryFactory() {
        return salaryFactory;
    }

    public void setSalaryFactory(long salaryFactory) {
        this.salaryFactory = salaryFactory;
    }
}
