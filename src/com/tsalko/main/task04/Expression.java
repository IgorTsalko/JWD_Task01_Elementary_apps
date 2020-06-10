package com.tsalko.main.task04;

public class Expression {

    public void showResult() {
        double x;
        double result;

        //random value;
        x = 20;

        result = calcResult(x);

        System.out.printf("Result of expression is: %.2f", result);
    }

    private double calcResult(double x) {
        double result;

        if (x <= 13) {
            result = -1 * Math.pow(x, 3) + 9;
        } else {
            result = -1 * (3 / (x +1));
        }

        return result;
    }
}
