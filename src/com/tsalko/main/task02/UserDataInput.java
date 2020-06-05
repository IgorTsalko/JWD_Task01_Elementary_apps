package com.tsalko.main.task02;

import java.util.Scanner;

public class UserDataInput {

    private UserDataOutput userDataOutput = new UserDataOutput();

    private Scanner in = new Scanner(System.in);

    public double getDoubleFromUser() {
        double data;

        while (true) {
            if (in.hasNextDouble()) {
                data = in.nextDouble();
                break;
            } else {
                in.next();
                userDataOutput.showError();
                userDataOutput.showMessage("Try again");
            }
        }

        return data;
    }

    public int getIntFromUser() {
        int data;

        while (true) {
            if (in.hasNextInt()) {
                data = in.nextInt();
                break;
            } else {
                in.next();
                userDataOutput.showError();
                userDataOutput.showMessage("Try again");
            }
        }

        return data;
    }
}
