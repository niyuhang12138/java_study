package com.nyh.test2;

/**
 * @author 28304
 * @date 2025/5/31
 * @description
 * String类型 String是JDK提供的一个类 属于引用数据类型 任何英文双引号包裹的内容 都是字符串
 */
public class TestString {
    public static void main(String[] args) {
        String str1 = "abc";
        System.out.println("str1 = " + str1);
        String str2 = "1234";
        System.out.println("str2 = " + str2);
        String str3 = "秦时明月汉时关";
        System.out.println("str3 = " + str3);
        String str4 = "fioashfio wfhiowfhweiofhow fhiwo";
        System.out.println("str4 = " + str4);
        String str5 = "\\\"";
        System.out.println("str5 = " + str5);
    }
}
