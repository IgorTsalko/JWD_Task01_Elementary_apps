package com.tsalko.main.task10;

public class Solution {

    private UserDataOutput output = new UserDataOutput();
    private UserDataInput input = new UserDataInput();
    private SolutionLogic logic = new SolutionLogic();

    public void solve() {
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

            if (!logic.isIncreasing(num, nextNum)) {
                isIncreasing = false;
            }

            if (logic.hasSamePair(num, nextNum)) {
                hasSamePair = true;
            }

            if (!logic.isAlternating(num, nextNum)) {
                isAlternating = false;
            }

            num = nextNum;
        }

        output.showResultForSequence(isIncreasing, hasSamePair, isAlternating);
    }
}
