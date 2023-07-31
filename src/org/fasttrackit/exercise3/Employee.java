package org.fasttrackit.exercise3;

import org.fasttrackit.exercise2.Person;

public class Employee extends Person {
    private String company;
    private int salary;

    public Employee(String name, int age, String hairColor, String company, int salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
}
