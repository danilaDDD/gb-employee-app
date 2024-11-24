package ru.gbdanila.employeeapp.employee;

import java.time.LocalDate;

import java.util.Comparator;
import java.util.List;

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
    private Gender gender;
    private Position position;
    private String phone;
    private int salary;
    private int birthYear;

    public Employee(String firstName, String secondName, String lastName, Gender gender, Position position, String phone, int salary, int birthYear) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.gender = gender;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public void congratulate(Employee[] employees){
        LocalDate nowDate = LocalDate.now();
        List<Holiday> holidays = Holiday.getHolidays();

        for(Employee employee: employees){
            if(!employee.equals(this)){
                for(Holiday holiday: holidays){
                    if(nowDate.getMonthValue() == holiday.getMonth()
                            && nowDate.getDayOfMonth() == holiday.getDay()){
                        switch (holiday){
                            case MARCH_8 -> {
                                if(employee.getGender() == Gender.FEMALE){{
                                    congratulate(employee, holiday);
                                }}
                            }
                            case FEBRUARY_23 -> {
                                if(employee.getGender() == Gender.MALE){
                                    congratulate(employee, holiday);
                            }}
                            default -> congratulate(employee, holiday);

                        }
                    }
                }
            }
        }
    }

    private void congratulate(Employee employee, Holiday holiday) {
        System.out.printf("Congratulate %s %s %s on %s%n",
                employee.firstName, employee.lastName, employee.secondName, holiday.getMessage());
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

    public Gender getGender() {
        return gender;
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
