package com.exception;
public class MyExcetionTest {
    public static int parseInt(String str) throws TypeSwapWxception {
        // 字符串转换为数字并返回
        int intValue = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9')
                intValue = intValue * 10 + ch - '0';
            else
                throw new TypeSwapWxception(str);
        }
        return intValue;
    }
   
