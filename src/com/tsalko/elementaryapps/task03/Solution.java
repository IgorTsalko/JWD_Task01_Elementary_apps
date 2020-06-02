package com.tsalko.elementaryapps.task03;

public class Solution {

    private UserDataOutput output = new UserDataOutput();

    public void solveExpression(int a, int b, int c) {
        String result;

        if (a > b && b > c) {
            result = String.format("%d, %d, %d", Math.abs(a * a), Math.abs(b * b), Math.abs(c * c));
            output.showMessage(result);
        } else {
            output.showMessage("Values don't match the condition");
        }
    }
}
