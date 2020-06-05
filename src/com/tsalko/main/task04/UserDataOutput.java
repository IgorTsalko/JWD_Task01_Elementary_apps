package com.tsalko.main.task04;

public class UserDataOutput {

    public void showMessage(String message) {
        if (message != null) {
            System.out.println(message);
        }
    }

    public void showError() {
        System.out.println("Error! Wrong data");
    }
}
