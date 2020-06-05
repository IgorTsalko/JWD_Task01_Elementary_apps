package com.tsalko.main.task01;

public class ExpressionLogic {

    public double getExpressionResult(double a, double b, double c) {
        double result;

        result = b + Math.sqrt(b*b + 4*a*c);
        result /= 2*a;
        result -= Math.pow(a, 3)*c + Math.pow(b, -2);

        return result;
    }
}
