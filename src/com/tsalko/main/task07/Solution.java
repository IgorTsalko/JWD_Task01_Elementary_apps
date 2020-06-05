package com.tsalko.main.task07;

public class Solution {

    public void swapFractionalAndIntegerParts() {
        double number;
        double swapNumber;

        //random value
        number = 375.766;

        if (String.valueOf(number).matches("\\d{3}.\\d{3}")) {
            double fractionPart = number %1;
            double integerPart = (number - fractionPart) / 1000;

            swapNumber = (int) (fractionPart * 1000) + integerPart;
            System.out.println("Swap number: " + swapNumber);
        } else {
            System.out.println("Wrong number");
        }
    }
}
