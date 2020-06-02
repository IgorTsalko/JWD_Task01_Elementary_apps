package com.tsalko.elementaryapps.task09;

public class Solution {

    private SolutionLogic logic = new SolutionLogic();
    private UserDataOutput output = new UserDataOutput();

    public void solve() {
        long result;

        result = logic.getSolve();

        output.showMessage("Result is: " + result);
    }
}
