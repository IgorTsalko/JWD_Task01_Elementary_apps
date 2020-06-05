package com.tsalko.main.task06;

public class Expression {

    public void solveExpression() {
        int a1;
        int d;
        long n;

        //random values
        a1 = 100_000_000;
        d = -29_000_000;

        n = getCountForInt(a1, d);
        System.out.println("Count for int: " + n);

        n = getCountForLong(a1, d);
        System.out.println("Count for long: " + n);
    }

    /*
    Приходиться писать такую сложную логику проверки, т.к. если а1 и d разнознаковые,
    сумма будет сначала увеличиваться, а после уменьшаться.
    Пример суммы на каждом шаге:

    Sum: 100000000
    Sum: 171000000
    Sum: 213000000
    Sum: 226000000
    Sum: 210000000
    Sum: 165000000
    Sum: 91000000
    Sum: -12000000
    Sum: -144000000
    Sum: -305000000
    Sum: -495000000
    Sum: -714000000
    Sum: -962000000
    Sum: -1239000000
    Sum: -1545000000
    Sum: -1880000000
     */

    private int getCountForInt(int a1, int d) {
        int sum = 0;
        int n = 1;
        int aN;

        while (true) {
            aN = a1 + (n - 1) * d;

            if (d > 0) {
                if (n > 1 && sum > a1 && (sum + aN) < 0) {
                    break;
                }
            } else {
                if (n > 1 && sum < a1 && (sum + aN) > 0) {
                    break;
                }
            }
            sum += aN;
            System.out.println("Sum: " + sum);
            n++;
        }

        return n;
    }

    private long getCountForLong(long a1, long d) {
        long sum = 0;
        long n = 1;
        long aN;

        while (true) {
            aN = a1 + (n - 1) * d;

            if (d > 0) {
                if (n > 1 && sum > a1 && (sum + aN) < 0) {
                    break;
                }
            } else {
                if (n > 1 && sum < a1 && (sum + aN) > 0) {
                    break;
                }
            }
            sum += aN;
            n++;
        }

        return n;
    }
}
