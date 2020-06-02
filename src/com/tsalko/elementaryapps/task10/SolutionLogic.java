package com.tsalko.elementaryapps.task10;

public class SolutionLogic {

    public boolean isIncreasing(int num, int nextNum) {
        return num < nextNum;
    }

    public boolean hasSamePair(int num, int nextNum) {
        return num == nextNum;
    }

    public boolean isAlternating(int num, int nextNum) {
        return num < 0 && nextNum > 0 || num > 0 && nextNum < 0;
    }
}
