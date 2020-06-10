package com.tsalko.main.task02;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        // random day
        int dayOfYear = 4;

        if (dayOfYear <= 365 && dayOfYear > 0) {
            calendar.showDayAndMonthByDayNumber(dayOfYear);
        } else {
            System.out.println("Invalid Day Number!");
        }
    }
}
