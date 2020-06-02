package com.tsalko.elementaryapps.task02;

public class CalendarLogic {

    private CalendarData calendarData = new CalendarData();

    public String getDayAndMonth(int number) {
        String[] months = calendarData.getMonths();
        int[] daysOfMonths = calendarData.getDaysOfMonth();
        int day = 0;
        String month = "None";

        int count = 0;
        for (int i = 0; i < daysOfMonths.length; i++) {
            count += daysOfMonths[i];

            if (count >= number) {
                day = number - (count - daysOfMonths[i]);
                if (day == 0) {
                    day = daysOfMonths[i];
                }

                month = months[i];
                break;
            }
        }

        return day + " " + month;
    }
}
