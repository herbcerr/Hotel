package org.example;

public class Employee {

    private  int employeeId ;
    private String name;
    private String department;
    private boolean payRated;
    private boolean hoursWorked;

    public Employee(int employeeId, String name, String department, boolean payRated, boolean hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRated = payRated;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isPayRated() {
        return payRated;
    }

    public void setPayRated(boolean payRated) {
        this.payRated = payRated;
    }

    public boolean isHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(boolean hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
