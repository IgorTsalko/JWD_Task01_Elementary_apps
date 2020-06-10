package com.tsalko.main.task01;

public class Expression {

    public void showResult() {

        // Названия переменных взяты из условия
        double a;
        double b;
        double c;
        double result;

        // randoms values
        a = 5;
        b = 12;
        c = 4;

        result = calcResult(a, b, c);

        System.out.printf("Result of expression is: %.2f", result);
    }

    private double calcResult(double a, double b, double c) {
        double result;

        result = b + Math.sqrt(b * b + 4 * a * c);
        result /= 2 * a;
        result -= Math.pow(a, 3) * c + Math.pow(b, -2);

        return result;
    }
}
