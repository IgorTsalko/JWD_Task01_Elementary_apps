package com.tsalko.main.task05;

public class UserDataOutput {

    public void showMessage(String message) {
        if (message != null) {
            System.out.println(message);
        }
    }

    public void showInt(int num) {
        System.out.println(num);
    }

    public void showError() {
        System.out.println("Error! Wrong data");
    }
}
