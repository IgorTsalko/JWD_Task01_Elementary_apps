package com.tsalko.main.task09;

public class Expression {

    public void solve() {
        long value;
        value = calculateValue();

        System.out.println("Result is: " + value);
    }

    private long calculateValue() {
        long value = 1;

        for (int i = 1; i < 10; i++) {
            int valueInParentheses = 0;
            for (int j = 1; j < i + 2; j++) {
                valueInParentheses += j;
            }
            value *= valueInParentheses;
        }

        return value;
    }
}
