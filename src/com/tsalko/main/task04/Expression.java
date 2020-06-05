package com.tsalko.main.task04;

public class Expression {

    public void solveExpression() {
        double x;
        double result;

        //random value;
        x = 20;

        if (x <= 13) {
            result = -1 * Math.pow(x, 3) + 9;
        } else {
            result = -1 * (3 / (x +1));
        }

        System.out.printf("Result of expression is: %.2f", result);
    }
}
