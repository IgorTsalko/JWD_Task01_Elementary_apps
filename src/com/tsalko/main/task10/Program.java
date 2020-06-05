package com.tsalko.main.task10;

public class Program {

    private UserDataOutput output = new UserDataOutput();
    private UserDataInput input = new UserDataInput();

    public void determineRequirements() {
        int num;
        int nextNum;
        boolean isIncreasing = true;
        boolean hasSamePair = false;
        boolean isAlternating = true;

        output.showMessage("Enter the first number:");
        if ((num = input.getIntFromUser()) == 0) {
            output.showError();
        }

        while (true) {
            output.showMessage("Enter next number:");
            nextNum = input.getIntFromUser();
            if (nextNum == 0) {
                break;
            }

            if (!(num < nextNum)) {
                isIncreasing = false;
            }

            if (num == nextNum) {
                hasSamePair = true;
            }

            if (!(num < 0 && nextNum > 0 || num > 0 && nextNum < 0)) {
                isAlternating = false;
            }

            num = nextNum;
        }

        output.showResultForSequence(isIncreasing, hasSamePair, isAlternating);
    }
}
