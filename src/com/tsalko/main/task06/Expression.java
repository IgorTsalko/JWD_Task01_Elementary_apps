package com.tsalko.main.task06;

public class Expression {

    public void solve() {
        // Название переменных взяты из формулы в условии
        int a1;
        int d;
        long n;

        // random values
        a1 = 100_000_000;
        d = -29_000_000;

        n = findCountForInt(a1, d);
        System.out.println("Count for int: " + n);


        n = findCountForLong(a1, d);
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

    Так же проблемы при:
    a1 = Integer.MAX_VALUE;
    d = Integer.MAX_VALUE;
    которые обходяться доп. блоком if
     */

    private int findCountForInt(int a1, int d) {
        // Название переменных взято из формулы в условии

        // Начальное сумма равна 0
        int sN = 0;
        // Отсчет от 1-го n
        int n = 1;
        int aN;
        int aNPrevious = 0;

        while (true) {
            aN = a1 + ((n - 1) * d);

            if (d > 0) {
                if (n > 1 && aN < aNPrevious) {
                    break;
                } else if (n > 1 && sN > 0 && (sN + aN) < 0) {
                    break;
                }
            } else {
                if (n > 1 && aN > aNPrevious) {
                    break;
                } else if (n > 1 && sN < 0 && (sN + aN) > 0) {
                    break;
                }
            }
            sN += aN;
            aNPrevious = aN;
            n++;
        }

        return n;
    }

    private long findCountForLong(long a1, long d) {
        // Название переменных взято из формулы в условии
        // Начальное сумма равна 0
        long sN = 0;
        // Отсчет от 1-го n
        long n = 1;
        long aN;
        long aNPrevious = 0;

        while (true) {
            aN = a1 + (n - 1) * d;

            if (d > 0) {
                if (n > 1 && aN < aNPrevious) {
                    break;
                } else if (n > 1 && sN > a1 && (sN + aN) < 0) {
                    break;
                }
            } else {
                if (n > 1 && aN > aNPrevious) {
                    break;
                } else if (n > 1 && sN < a1 && (sN + aN) > 0) {
                    break;
                }
            }
            sN += aN;
            aNPrevious = aN;
            n++;
        }

        return n;
    }
}
