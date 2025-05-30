package com.nyh.test2;

/**
 * 转义字符：可以用于保存一些特殊符号 或者 实现一些特殊的效果
 */
public class TestConvertSign {
    public static void main(String[] args) {
        // 斜杠\ 转义字符 将后面的内容进行转义
        char ch1 = '\'';
        System.out.println("ch1 = " + ch1);

        // \n 换行
        System.out.println("a\nb\nc");

        // \t 缩进制表符
        System.out.println("a\tb\tc");

        // \\ 反斜杠
        System.out.println("a\\b\\c");

        // \' 单引号
        System.out.println("a\'b\'c");

        // \" 双引号 如果使用char类型保存一个英文的双引号 是否转义保存都可以
        char cha2 = '"';
        System.out.println("cha2 = " + cha2);
        String s1 = "\"";
        System.out.println("s1 = " + s1);
        System.out.println("a\"b\"c");
    }
}
