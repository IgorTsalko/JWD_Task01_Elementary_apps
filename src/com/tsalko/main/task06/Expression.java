package com.tsalko.main.task06;

public class Expression {

    public void showResult() {
        // Названия переменных взяты из формулы в условии
        int a1;
        int d;
        long n;

        // random values
        a1 = 1_000_000_000;
        d = -1000;

        n = findStepForInt(a1, d);
        System.out.println("Count for int: " + n);

        n = findStepForLong(a1, d);
        System.out.println("Count for long: " + n);
    }

    /**
     * Приходиться писать сложную логику проверки, т.к. есть большо количество
     * начальных значений a1 и d; Разнознаковые, с одинаковым знаком,
     * близкое значение к максимальному и т.д и т.п.
     *
     * Метод протестирован на все возможные вариации, которые удалось вспомнить
     *
     * @param a1 начальное а
     * @param d шаг функции
     * @return шаг, на котором функция превысит значение int
     */
    private int findStepForInt(int a1, int d) {

        int aN;
        int sN;
        int n;
        int aNPrevious;

        sN = 0;
        n = 1;
        aNPrevious = 0;
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

    private long findStepForLong(long a1, long d) {

        long aN;
        long sN;
        long n;
        long aNPrevious;

        sN = 0;
        n = 1;
        aNPrevious = 0;
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
