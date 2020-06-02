package com.tsalko.elementaryapps.task07;

public class SolutionLogic {

    public double swapParts(double number) {
        double fractionPart = number %1;
        double integerPart = (number - fractionPart) / 1000;

        return Math.ceil(fractionPart * 1000) + integerPart;
    }
}
