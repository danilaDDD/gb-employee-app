package ru.gbdanila.employeeapp;

import ru.gbdanila.employeeapp.employee.Chief;
import ru.gbdanila.employeeapp.employee.Employee;
import ru.gbdanila.employeeapp.employee.Gender;
import ru.gbdanila.employeeapp.employee.Position;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Chief chief =  new Chief("olga", "nikiforovna", "petrovna", Gender.FEMALE,
                "89113874810", 30_000, 1950);

        Employee[] employees = {
                new Employee("ivanov", "ivan", "ivanov", Gender.MALE, Position.PROGRAMMER,
                        "89113874810", 30_000, 1956),
                new Employee("anna", "anatoly", "dmitrieva", Gender.FEMALE, Position.MANAGER,
                        "89113874910", 30_000, 1957),
                new Employee("peter", "petrov", "ivanov", Gender.MALE, Position.PROGRAMMER,
                        "89115674810", 30_000, 2000),
                new Employee("nikitin", "danila", "anatoly", Gender.MALE, Position.MANAGER,
                        "89113874810", 30_000, 1956),
               chief
        };

        Chief.increaseSalary(employees, 5_000);
        chief.congratulate(employees);

        for(Employee employee: employees){
            System.out.println(employee);
        }
        Employee.printAverageAgeAndSalary(employees);
    }
}