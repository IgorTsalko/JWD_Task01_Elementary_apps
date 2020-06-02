package com.tsalko.elementaryapps.task08;

import java.util.Map;

public class UserDataOutput {

    public void showMessage(String message) {
        if (message != null) {
            System.out.println(message);
        }
    }

    public void showFunctionResults(Map<Double, Double> results) {
        for (Map.Entry<Double, Double> step : results.entrySet()) {
            System.out.printf("Value x: %5.1f   result y = %5.1f\n", step.getKey(), step.getValue());
        }
    }

    public void showError() {
        System.out.println("Error! Wrong data");
    }
}
