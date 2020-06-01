package com.exercise;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class DecodeUrlTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String location = "http://xxx.xxxx.com/%E6%96%B0%E5%BB%BA%E6%96%87%E6%9C%AC%E6%96%87%E6%A1%A3.zip";

        final int i = location.lastIndexOf("/");
        final String substring = location.substring(i+1);
        System.out.println(substring);
        System.out.println(StandardCharsets.UTF_8.displayName());
        final String decode = URLDecoder.decode(substring, StandardCharsets.UTF_8.displayName());
        System.out.println(decode);
    }
}
