package com.tsalko.main.task06;

public class ExpressionLogic {

    public long getStepNumberForInt(long a1, long d) {
        long sN = 0;
        long n = 1;
        long aN;

        if (d != 0) {
            while (true) {
                aN = a1 + (n - 1) * d;
                sN += aN;
                if (sN > Integer.MAX_VALUE || sN < Integer.MIN_VALUE) {
                    break;
                }
                n++;
            }
        }
        return n;
    }

    public long getStepNumberForLong(long a1, long d) {
        long sN = 0;
        long n = 1;
        long aN;

        // Проверяем чтобы шаг не был 0, или будет бесконечный цикл
        if (d != 0) {
            while (true) {
                aN = a1 + (n - 1) * d;

                /*
                Если сумма положительная при отрицательном шаге, или сумма отрицательная
                при положительном шаге, значит вышли за пределы.
                 */
                if (d > 0) {
                    if (n > 1 && sN > a1 && (sN + aN) < 0) {
                        break;
                    }
                } else {
                    if (n > 1 && sN < a1 && (sN + aN) > 0) {
                        break;
                    }
                }

                sN += aN;
                n++;
            }
        }

        return n;
    }
}
