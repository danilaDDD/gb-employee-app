package ru.gbdanila.employeeapp.employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public enum Holiday {
    NOT_HOLIDAY,
    MARCH_8("March 23", 3, 8),
    FEBRUARY_23("February 23", 2, 23),
    NEW_YEAR("New Year", 12, 31),
    LABOR_DAY("Labor day", 5, 1);

    public static List<Holiday> getHolidays(){
        return Arrays.stream(Holiday.values())
                .filter(holiday -> !holiday.equals(NOT_HOLIDAY))
                .toList();
    }

    private String message;
    private Integer month;
    private Integer day;

    Holiday(String message, Integer month, Integer day) {
        this.message = message;
        this.month = month;
        this.day = day;
    }

    Holiday(String message) {
        this.message = message;
    }

    Holiday() {
    }

    public String getMessage() {
        return message;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }
}
