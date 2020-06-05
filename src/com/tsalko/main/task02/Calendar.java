package com.tsalko.main.task02;

public class Calendar {

    private UserDataOutput output = new UserDataOutput();
    private CalendarLogic logic = new CalendarLogic();

    public void dayAndMonthByDayNumber(int dayNumber) {
        String result;
        if (dayNumber <= 365) {
            result = logic.getDayAndMonth(dayNumber);
            output.showMessage(result);
        } else {
            output.showError();
        }
    }
}
