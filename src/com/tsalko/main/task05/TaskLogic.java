package com.tsalko.main.task05;

public class TaskLogic {

    public int calcSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int calcMultiplicationOfDigits(int num) {
        int multiplication = 1;
        while (num != 0) {
            multiplication *= num % 10;
            num /= 10;
        }
        return multiplication;
    }

    public int numberViceVersa(int num) {
        int viceVersa;
        int a;
        int b;
        int c;

        a = num % 10;
        num /= 10;
        b = num % 10;
        num /= 10;
        c = num;
        viceVersa = a * 100 + b * 10 + c;
        return viceVersa;
    }

    public int madeFourDigitNumber(int num) {
        int fourDigit;
        int a;

        a = num % 10;

        fourDigit = a * 1000 + num;
        return fourDigit;
    }
}
