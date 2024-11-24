package ru.gbdanila.employeeapp.employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Employee {
    public static void printAverageAgeAndSalary(Employee[] employees){
        double averageAge;
        double averageSalary;

        if(employees.length == 0) {
            averageSalary = 0;
            averageAge = 0;
        }else {
            int ageSum = 0;
            int salarySum = 0;
            for (Employee employee : employees) {
                ageSum += employee.getAge();
                salarySum += employee.getSalary();
            }
            averageAge = (double)ageSum / employees.length;
            averageSalary = (double)salarySum / employees.length;
        }

        System.out.printf("averageAge=%s, averageSalary=%s", averageAge, averageSalary);

    }

    private String firstName;
    private String lastName;
    private String secondName;
    private Position position;
    private String phone;
    private int salary;
    private int birthYear;

    public Employee(String firstName, String secondName, String lastName, Position position, String phone, int salary, int birthYear) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo(){
        return String.format("Employee{firstName=%s, secondName=%s, lastName=%s, position=%s, salary=%s, phone=%s, birthYear=%s}",
                firstName, secondName, lastName, position, salary, phone, birthYear);
    }

    public int getAge(){
        int nowYear = LocalDate.now().getYear();
        return nowYear - birthYear;
    }

    public class LocalDateComparator implements Comparator<LocalDate>{

        @Override
        public int compare(LocalDate date1, LocalDate date2) {
            return date1.compareTo(date2);
        }
    }


}
