package org.example;

import javax.persistence.*;

public

@Entity
@Table(name = "employee_table")
class Employee {

    @Id
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "job")
    private String job;

    public Employee() {
    }

    public Employee(int employeeId, String name, String job) {
        this.employeeId = employeeId;
        this.name = name;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}


