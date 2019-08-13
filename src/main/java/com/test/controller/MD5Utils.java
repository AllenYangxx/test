package com.test.controller;

import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class MD5Utils {

    public static String encrypt(String text) {
        try {
            byte[] btyes = text.getBytes("UTF-8");
            System.out.println("byte:" + Arrays.toString(btyes) );
            return DigestUtils.md5DigestAsHex(btyes);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String phone = "18922120086";
        //能力串，暂定为时间戳
        String screanId = String.valueOf(System.currentTimeMillis());
        System.out.println("phone:" + phone + ",screanId:"+screanId);
        String token = encrypt(phone+screanId);
        System.out.println(token);
    }
}
