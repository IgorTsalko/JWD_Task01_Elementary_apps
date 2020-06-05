package com.tsalko.main.task05;

public class Solution {

    private SolutionLogic logic = new SolutionLogic();

    public void getSolution() {
        int number;
        int result;

        //random value
        number = 857;

        result = logic.findSumOfDigits(number);
        System.out.printf("Sum of digits of the number: %d", result);

        result = logic.findMultiplicationOfDigits(number);
        System.out.printf("Multiplication of digits of the number: %d", result);

        result = logic.numberViceVersa(number);
        System.out.printf("Number vice versa: %d", result);

        result = logic.madeFourDigitNumber(number);
        System.out.printf("Made four-digit number: %d", result);
    }
}
