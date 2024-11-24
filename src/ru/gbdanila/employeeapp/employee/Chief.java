package ru.gbdanila.employeeapp.employee;

import java.util.Arrays;

public class Chief extends Employee{
    public static void increaseSalary(Employee[] employees, int amount) {
        Arrays.stream(employees)
                .filter(employee -> employee.getAge() > 45)
                .filter(employee -> !(employee instanceof Chief))
                .forEach(employee -> employee.setSalary(employee.getSalary() + amount));
    }

    public Chief(String firstName, String secondName, String lastName, Gender gender, String phone, int salary, int birthYear) {
        super(firstName, secondName, lastName, gender, Position.CHIEF, phone, salary, birthYear);
    }


}
