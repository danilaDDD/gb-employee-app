package ru.gbdanila.employeeapp;

import ru.gbdanila.employeeapp.employee.Chief;
import ru.gbdanila.employeeapp.employee.Employee;
import ru.gbdanila.employeeapp.employee.Position;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("ivanov", "ivan", "ivanov", Position.PROGRAMMER,
                        "89113874810", 30_000, 1956),
                new Employee("dmitry", "dmitry", "dmitry", Position.MANAGER,
                        "89113874910", 30_000, 1957),
                new Employee("peter", "petrov", "ivanov", Position.PROGRAMMER,
                        "89115674810", 30_000, 2000),
                new Employee("nikitin", "danila", "anatoly", Position.MANAGER,
                        "89113874810", 30_000, 1956),
                new Chief("andrey", "nikiforov", "petrovich",
                        "89113874810", 30_000, 1950)
        };

        Chief.increaseSalary(employees, 5_000);
        for(Employee employee: employees){
            System.out.println(employee);
        }
        Employee.printAverageAgeAndSalary(employees);
    }
}