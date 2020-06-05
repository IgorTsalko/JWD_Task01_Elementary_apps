package com.tsalko.main.task10;

public class UserDataOutput {

    public void showMessage(String message) {
        if (message != null) {
            System.out.println(message);
        }
    }

    public void showResultForSequence(boolean isIncreasing, boolean hasSamePair, boolean isAlternating) {
        if (isIncreasing) {
            System.out.println("The sequence increasing");
        } else {
            System.out.println("The sequence doesn't increasing");
        }

        if (hasSamePair) {
            System.out.println("The sequence has the same pair");
        } else {
            System.out.println("The sequence doesn't have the same pair");
        }

        if (isAlternating) {
            System.out.println("The sequence alternating");
        } else {
            System.out.println("The sequence doesn't alternating");
        }
    }

    public void showError() {
        System.out.println("Error! Wrong data");
    }
}
