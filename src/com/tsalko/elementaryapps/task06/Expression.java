package com.tsalko.elementaryapps.task06;

public class Expression {

    private UserDataInput input = new UserDataInput();
    private UserDataOutput output = new UserDataOutput();
    private ExpressionLogic logic = new ExpressionLogic();

    public void solveExpression() {
        long a1;
        long d;
        long n;

        output.showMessage("Enter a1:");
        a1 = input.getLongFromUser();

        output.showMessage("Enter d:");
        d = input.getLongFromUser();

        n = logic.getStepNumberForInt(a1, d);
        output.showMessage("Count for int: " + n);

        n = logic.getStepNumberForLong(a1, d);
        output.showMessage("Count for long: " + n);
    }
}
