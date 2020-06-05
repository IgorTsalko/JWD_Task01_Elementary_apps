package com.tsalko.main.task07;

public class Solution {

    private UserDataInput input = new UserDataInput();
    private UserDataOutput output = new UserDataOutput();
    private SolutionLogic logic = new SolutionLogic();

    public void swapFractionalAndIntegerParts() {
        double number;
        double result;
        output.showMessage("Enter a number matches this pattern nnn.ddd:");
        number = input.getDoubleFromUser();

        if (String.valueOf(number).matches("\\d{3}.\\d{3}")) {
            result = logic.swapParts(number);
            output.showMessage("Swap number: " + result);
        } else {
            output.showError();
        }
    }
}
