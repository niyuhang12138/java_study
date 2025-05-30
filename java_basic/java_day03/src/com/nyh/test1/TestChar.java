package com.nyh.test1;

/**
 * char类型 取值范围 无符号 0~65535
 */
public class TestChar {
    public static void main(String[] args) {
        // 赋值方式1 直接使用英文的单引号包裹任意一个内容
        char ch1 = 'a';
        System.out.println("ch1 = " + ch1);
        char ch2 = '1';
        System.out.println("ch2 = " + ch2);
        char ch3 = '中';
        System.out.println("ch3 = " + ch3);
        char ch4 = '~';
        System.out.println("ch4 = " + ch4);

        // 赋值方式2 直接赋值0~65535中的数字
        // ASCII 美国标准信息码
        // 中文汉字以及中文标准符号 参考Unicode编码表 Unicode编码表是一个十六进制的编码表
        // 记录了世界上绝大多数的国家的语言 中文的取值范围是：\u4e00(19968) ~ \u9fa5(40869)
        char ch5 = 65;
        System.out.println("ch5 = " + ch5);
        char ch6 = 66;
        System.out.println("ch5 = " + ch5);
        char ch7 = 67;
        System.out.println("ch7 = " + ch7);

        // 赋值方式3 unicode 十六进制数
        char ch8 = '\u0041';
        System.out.println("ch8 = " + ch8);
    }
}
