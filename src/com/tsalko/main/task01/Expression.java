package com.tsalko.main.task01;

public class Expression {

    private double a;
    private double b;
    private double c;
    private double result;

    public void solveExpression() {

        // randoms values
        a = 5;
        b = 12;
        c = 4;

        result = b + Math.sqrt(b * b + 4 * a * c);
        result /= 2 * a;
        result -= Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.printf("Result of expression is: %.2f", result);
    }
}
