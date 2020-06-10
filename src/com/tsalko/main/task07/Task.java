package com.tsalko.main.task07;

public class Task {

    public void showSwappedFractionalAndIntegerParts() {

        double number;
        double swapNumber;

        //random value
        number = 375.766;

        swapNumber = swapFractionalAndIntegerParts(number);
        System.out.println("Swap number: " + swapNumber);
    }

    public double swapFractionalAndIntegerParts(double number) {

        double swapNumber;

        double fractionPart = number %1;
        double integerPart = (number - fractionPart) / 1000;

        swapNumber = (int) (fractionPart * 1000) + integerPart;

        return swapNumber;
    }
}
