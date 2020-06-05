package com.tsalko.main.task04;

public class Expression {

    private ExpressionLogic logic = new ExpressionLogic();
    private UserDataInput input = new UserDataInput();
    private UserDataOutput output = new UserDataOutput();

    private double x;
    private double result;

    public void solveExpression() {
        output.showMessage("Enter x:");
        x = input.getDoubleFromUser();

        result = logic.getExpressionResult(x);

        output.showMessage(String.format("Result of expression is: %.2f", result));
    }
}
