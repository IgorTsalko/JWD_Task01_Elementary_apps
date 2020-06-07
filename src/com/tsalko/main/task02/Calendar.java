package com.tsalko.main.task02;

public class Calendar {

    public void dayAndMonthByDayNumber(int dayOfYear) {
        String date;

        if (dayOfYear <= 365 && dayOfYear > 0) {
            date = formDateByDayNumber(dayOfYear);
            System.out.println(date);
        } else {
            System.out.println("Invalid Day Number!");
        }
    }

    /**
     * Метод для решения через switch
     * @param dayOfYear номер дня в году
     */
    private String formDateByDayNumber(int dayOfYear) {
        // Начинаем проверять с первого месяца
        int monthNumber = 1;

        // Default value
        int daysInMonth = 0;

        while (true) {
            switch (monthNumber) {
                case 2 -> daysInMonth = 28;
                case 4, 6, 9, 11 -> daysInMonth = 30;
                case 1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31;
            }

            if (dayOfYear <= daysInMonth) {
                break;
            } else {
                dayOfYear -= daysInMonth;
                monthNumber++;
            }
        }

        // Возврат форматированной даты без названия месяца
        return String.format("Month: %02d, day: %02d", monthNumber, dayOfYear);
    }
    
    /**
     * Метод для решения через Enum с выводом названия месяца
     * @param dayOfYear номер дня в году
     * @return форматированную строку даты в виде "Месяц день"
     */
    private String formDateByDayNumberViaEnum(int dayOfYear) {
        String date = "";

        for (Month month : Month.values()) {
            if (dayOfYear <= month.daysInMonth) {
                date = month.name() + " " + dayOfYear;
                break;
            } else {
                dayOfYear -= month.daysInMonth;
            }
        }

        return date;
    }

    // Enum вложен, так как отношение Calendar к Month - has a
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
