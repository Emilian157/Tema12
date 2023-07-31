package org.fasttrackit.exercise3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMethods {
    public static List<Employee> biggerSalariesThan(List<Employee> employeeList, int givenSalary){
        List<Employee> salaryBiggerThan = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getSalary() > givenSalary) {
                salaryBiggerThan.add(employee);
            }
        }
        return salaryBiggerThan;
    }

    public static int sumOfAllSalaries(List<Employee> employeeList) {
        int allSalaries = 0;
        for( Employee employee : employeeList) {
            allSalaries += employee.getSalary();
        }
        return allSalaries;
    }

    public static List<String> bestPayingCompany(List<Employee> employeeList) {
        List<String> companyWithHighestSalary = new ArrayList<>();
        int highestSalary = 0;

        for (Employee employee : employeeList) {
            if (employee.getSalary() > highestSalary) {
                highestSalary = employee.getSalary();
                companyWithHighestSalary.clear();
                companyWithHighestSalary.add(employee.getCompany());
            }else if(employee.getSalary() == highestSalary) {
                companyWithHighestSalary.add(employee.getCompany());
            }
        }

        return companyWithHighestSalary;
    }
}
