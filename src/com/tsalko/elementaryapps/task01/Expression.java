package com.tsalko.elementaryapps.task01;

public class Expression {

    private ExpressionLogic logic = new ExpressionLogic();
    private UserDataInput input = new UserDataInput();
    private UserDataOutput output = new UserDataOutput();

    private double a;
    private double b;
    private double c;
    private double result;

    public void solveExpression() {
        output.showMessage("To solve the expression enter variables a, b, c");

        output.showMessage("Enter a:");
        a = input.getDoubleFromUser();

        output.showMessage("Enter b:");
        b = input.getDoubleFromUser();

        output.showMessage("Enter c:");
        c = input.getDoubleFromUser();

        result = logic.getExpressionResult(a, b, c);

        output.showMessage(String.format("Result of expression is: %.2f", result));
    }
}
