package com.exercise;

import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileMd5Caculate {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        byte[] uploadBytes = new byte[333];
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] digest = md5.digest(uploadBytes);
        String hashString = new BigInteger(1, digest).toString(16);
//        log.info("计算的MD5 hashString= {}", hashString);

    }
}
