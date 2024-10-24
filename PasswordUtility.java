package com.billy.passwordmanager;

import com.password4j.Argon2Function;
import com.password4j.Password;
import com.password4j.types.Argon2;


public class PasswordUtility {
    private static final Argon2Function a2 = Argon2Function.getInstance(16, 65536, 1, 32, Argon2.ID);
    
    public static String hashPassword(String plain) {
        return Password.hash(plain).addRandomSalt(16).with(a2).getResult();
    }

    public static boolean verifyPassword(String plain, String hashed) {
        return Password.check(plain, hashed).with(a2);
    }
}
