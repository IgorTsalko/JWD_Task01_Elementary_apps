package com.tsalko.elementaryapps.task03;

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
