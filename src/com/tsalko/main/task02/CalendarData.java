package com.tsalko.main.task02;

public class CalendarData {

    private String[] months =  {
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
    };

    private int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public String[] getMonths() {
        return months;
    }

    public int[] getDaysOfMonth() {
        return daysOfMonth;
    }
}
