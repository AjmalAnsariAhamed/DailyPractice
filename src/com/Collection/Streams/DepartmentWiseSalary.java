package com.Collection.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWiseSalary {
   static class Employee{
         String department;
         String name;
         int salary;

       public Employee(String department, String name, int salary) {
           this.department = department;
           this.name = name;
           this.salary = salary;
       }

       public String getDepartment() {
           return department;
       }

       public String getName() {
           return name;
       }

       public int getSalary() {
           return salary;
       }
   }

    public static void main(String[] args) {
        ArrayList<Employee> departments=new ArrayList<>(Arrays.asList(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "Engineering", 75000),
                new Employee("Charlie", "HR", 55000),
                new Employee("David", "Engineering", 80000),
                new Employee("Eve", "Sales", 60000),
                new Employee("Frank", "Sales", 65000)
        ));

        Map<String,Integer> map=departments.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment,
                                Collectors.summingInt(Employee::getSalary)));
        System.out.println(map);
    }
}
