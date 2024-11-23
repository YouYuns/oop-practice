package org.example;

public class PasswordVaildator {

   private static final String WRONG_PASSWORD_LENGTH = "Password length must be between 8 and 12";
    public static void vaildate(String password) {
        int length = password.length();

        if(length < 8 || length > 12) {
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH);
        }
    }
}
