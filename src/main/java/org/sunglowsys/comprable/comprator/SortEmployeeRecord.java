package org.sunglowsys.comprable.comprator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEmployeeRecord {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(3, "Amit", 6000),
                new Employee(2, "Shivam", 5000),
                new Employee(9, "Ranjit", 9000),
                new Employee(1, "Tejvir", 7000),
                new Employee(5, "Surendra", 8000));
        for (int i = 0; i < employees.size(); i++)
            Collections.sort(employees, new SortOnSalary());
        employees.forEach(System.out::println);


        System.out.println("--------------------------------------------");
        for (int i = 0; i < employees.size(); i++)

            Collections.sort(employees, new SortOnName());
        employees.forEach(System.out::println);


        System.out.println("----------------------------------------");
        for (int i = 0; i < employees.size(); i++)
            Collections.sort(employees, new SortOnIdEmp());
        employees.forEach(System.out::println);


    }

}
