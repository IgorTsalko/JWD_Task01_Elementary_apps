package com.tsalko.main.task08;

import java.util.ArrayList;

public class Expression {

    public void solve() {
        ArrayList<Double> values;
        double a;
        double b;
        double h;

        //random values
        a = 5;
        b = 33;
        h = 4;

        values = findValues(a, b, h);

        System.out.println(values);

    }

    private ArrayList<Double> findValues(double a, double b, double h) {
        ArrayList<Double> values = new ArrayList<>();
        double y;
        double x = a;

        //random value
        int c = 5;

        while (x <= b) {
            if (x != 15) {
                y = (x - c) + 6;
            } else {
                y = (x + c) * 2;
            }
            values.add(y);
            x += h;
        }

        return values;
    }

}
