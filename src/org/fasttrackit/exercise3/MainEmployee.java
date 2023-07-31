package org.fasttrackit.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Marius", 34, "Maro", "Ford",4300);
        Employee employee2 = new Employee("Catalin", 63, "Alb", "Ford",5200);
        Employee employee3 = new Employee("Ana", 21, "Verde", "Audi",3700);
        Employee employee4 = new Employee("Cristina", 30, "Maro", "Audi",4000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        int givenSalary = 4100;
        List<Employee> biggerSalary = EmployeeMethods.biggerSalariesThan(employeeList, givenSalary);
        for (Employee employee : biggerSalary) {
            System.out.println(employee.getName() + " - salary: " + employee.getSalary());
        }

        int totalSalaries = EmployeeMethods.sumOfAllSalaries(employeeList);
        System.out.println("Suma totala a salariilor este de: " + totalSalaries);
        List<String> bestPayingCompany = EmployeeMethods.bestPayingCompany(employeeList);
        System.out.println("Compania care plateste mai bine este: " + bestPayingCompany);
    }
}
