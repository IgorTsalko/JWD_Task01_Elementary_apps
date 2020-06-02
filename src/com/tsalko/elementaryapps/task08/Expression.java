package com.tsalko.elementaryapps.task08;

import java.util.HashMap;
import java.util.Map;

public class Expression {

    private UserDataOutput output = new UserDataOutput();
    private UserDataInput input = new UserDataInput();
    private ExpressionLogic logic = new ExpressionLogic();

    public void solveExpression() {
        Map<Double, Double> results = new HashMap<>();
        double a;
        double b;
        double h;

        output.showMessage("Enter a:");
        a = input.getDoubleFromUser();

        output.showMessage("Enter b:");
        b = input.getDoubleFromUser();

        output.showMessage("Enter h:");
        h = input.getDoubleFromUser();

        results = logic.getSolve(a, b, h);

        output.showFunctionResults(results);

    }

}
