package com.tsalko.elementaryapps.task05;

public class Solution {

    private UserDataOutput output = new UserDataOutput();
    private UserDataInput input = new UserDataInput();
    private SolutionLogic logic = new SolutionLogic();

    public void getSolution() {
        int number;
        int result;

        output.showMessage("Enter three-digit number:");
        number = input.getIntFromUser();

        result = logic.findSumOfDigits(number);
        output.showMessage(String.format("Sum of digits of the number: %d", result));

        result = logic.findMultiplicationOfDigits(number);
        output.showMessage(String.format("Multiplication of digits of the number: %d", result));

        result = logic.numberViceVersa(number);
        output.showMessage(String.format("Number vice versa: %d", result));

        result = logic.madeFourDigitNumber(number);
        output.showMessage(String.format("Made four-digit number: %d", result));
    }
}
