package com.workintech.developers;

public class Employee {
    private int id;
    private String name;
    private int salary;


    public Employee(int id, String name, int sallary) {
        this.id = id;
        this.name = name;
        this.salary = sallary;
    }

    public void work() {
        System.out.println("Employee starts to working");
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sallary=" + salary +
                '}';
    }


}
