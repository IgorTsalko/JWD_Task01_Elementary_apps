package com.tsalko.main.task04;

public class ExpressionLogic {

    public double getExpressionResult(double x) {
        double result = 0;

        if (x <= 13) {
            result = -1 * Math.pow(x, 3) + 9;
        } else if (x > 13) {
            result = -1 * (3 / (x +1));
        }

        return result;
    }
}
