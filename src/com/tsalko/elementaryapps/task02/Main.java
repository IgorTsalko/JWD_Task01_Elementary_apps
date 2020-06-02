package com.tsalko.elementaryapps.task02;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        UserDataInput input = new UserDataInput();
        UserDataOutput output = new UserDataOutput();
        int dayNumber;

        output.showMessage("Enter day Number:");
        dayNumber = input.getIntFromUser();
        calendar.dayAndMonthByDayNumber(dayNumber);
    }
}
