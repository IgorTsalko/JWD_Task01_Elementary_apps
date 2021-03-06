package com.tsalko.main.task03;

public class Task {

    public void showResult(int a, int b, int c) {

        /*
        Метод не должен считать результат, но выносить расчет в отдельный метод,
        кажеться будет уже слишком, хотя можно сделать.
         */
        if (a > b && b > c) {
            System.out.printf("%d, %d, %d", Math.abs(a * a), Math.abs(b * b), Math.abs(c * c));
        } else {
            System.out.println("Values don't match the condition");
        }
    }
}
