package com.tsalko.main.task05;

public class Task {

    private TaskLogic logic = new TaskLogic();

    public void showResult() {
        int number;
        int result;

        //random value
        number = 857;

        result = logic.calcSumOfDigits(number);
        System.out.printf("Sum of digits of the number: %d", result);

        result = logic.calcMultiplicationOfDigits(number);
        System.out.printf("Multiplication of digits of the number: %d", result);

        result = logic.numberViceVersa(number);
        System.out.printf("Number vice versa: %d", result);

        result = logic.madeFourDigitNumber(number);
        System.out.printf("Made four-digit number: %d", result);
    }
}
