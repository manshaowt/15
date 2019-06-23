package com.exception;
class TypeSwapWxception extends Exception {
    private String str;
    TypeSwapWxception(String str) {
        this.str = str;
    }
    @Override
    public String toString() {
        return str + "存在非数字字符，无法转换";
    }
}
