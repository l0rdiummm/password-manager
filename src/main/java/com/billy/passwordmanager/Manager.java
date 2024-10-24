package com.billy.passwordmanager;

import java.util.Scanner;

public class Manager {
    private static String storedHash = null;

    public static void main (String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            if (storedHash == null) {
                String master = scan.nextLine();
                
                storedHash = PasswordUtility.hashPassword(master);
            } else {
                String inputMaster = scan.nextLine();
                boolean isValid = PasswordUtility.verifyPassword(inputMaster, storedHash);
                
                if (isValid) {
                    
                } else {
                    
                }
            }
        }
    }
}
