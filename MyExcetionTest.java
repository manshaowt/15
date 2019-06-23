package com.exception;
class TypeSwapWxception extends Exception {
    private String str;
    TypeSwapWxception(String str) {
        this.str = str;
    }
    @Override
    public String toString() {
        return str + "���ڷ������ַ����޷�ת��";
    }
}
public class MyExcetionTest {
    public static int parseInt(String str) throws TypeSwapWxception {
        // �ַ���ת��Ϊ���ֲ�����
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
    public static void main(String[] args) {
        String testStr = "@A1B123";
        try {
            int result = parseInt(testStr);
            System.out.println("ת���������� : " + String.valueOf(result));
        } catch (TypeSwapWxception e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
