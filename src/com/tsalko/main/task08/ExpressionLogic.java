package com.tsalko.main.task08;

import java.util.HashMap;
import java.util.Map;

public class ExpressionLogic {

    public Map<Double, Double> getSolve(double a, double b, double h) {
        Map<Double, Double> results = new HashMap<>();
        double y;
        double x = a;
        int c = 5; // любое значение для данного выражения

        while (x <= b) {
            if (x != 15) {
                y = (x - c) + 6;
            } else {
                y = (x + c) * 2;
            }
            results.put(x, y);
            x += h;
        }

        return results;
    }
}
