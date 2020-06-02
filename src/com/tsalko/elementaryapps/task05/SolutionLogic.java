package com.tsalko.elementaryapps.task05;

public class SolutionLogic {

    public int findSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int findMultiplicationOfDigits(int num) {
        int multiplication = 1;
        while (num != 0) {
            multiplication *= num % 10;
            num /= 10;
        }
        return multiplication;
    }

    public int numberViceVersa(int num) {
        int v;
        int a;
        int b;
        int c;

        a = num % 10;
        num /= 10;
        b = num % 10;
        num /= 10;
        c = num;
        v = a * 100 + b * 10 + c;
        return v;
    }

    public int madeFourDigitNumber(int num) {
        int fourDigit;
        int a;

        a = num % 10;

        fourDigit = a * 1000 + num;
        return fourDigit;
    }
}
