package com.tsalko.main.task09;

public class SolutionLogic {

    public long getSolve() {
        long result = 1;

        for (int i = 1; i < 10; i++) {
            int valueInParentheses = 0;
            for (int j = 1; j < i + 2; j++) {
                valueInParentheses += j;
            }
            result *= valueInParentheses;
        }

        return result;
    }
}
