package com.tsalko.main.task02;

public class Calendar {

    public void dayAndMonthByDayNumber(int dayNumber) {
        String date;

        if (dayNumber <= 365 && dayNumber > 0) {
            date = getDateByDayNumber(dayNumber);
            System.out.println(date);
        } else {
            System.out.println("Invalid Day Number!");
        }
    }

    private String getDateByDayNumber(int dayNumber) {
        String date = "";

        for (Month month : Month.values()) {
            if (dayNumber <= month.daysInMonth) {
                date = month.name() + " " + dayNumber;
                break;
            } else {
                dayNumber -= month.daysInMonth;
            }
        }

        return date;
    }

    private enum Month {
        January(31),
        February(28),
        March(31),
        April(30),
        May(31),
        June(30),
        July(31),
        August(31),
        September(30),
        October(31),
        November(30),
        December(31);

        private int daysInMonth;

        Month(int daysInMonth) {
            this.daysInMonth = daysInMonth;
        }
    }
}
