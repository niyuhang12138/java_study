package com.nyh.test4;

/**
 * @author 28304
 * @date 2025/5/31
 * @description
 * 算数运算符：+ - * / % ++ --
 */
public class TestMathOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b); // 取模
        
        // ++ 和 --
        // ++表示自增1
        // --表示自减1
        // ++或者-- 如果单独作为一条语句书写 在前后没有区别
        // 如果不是单独作为一条语句书写 在前后有区别
        // 如果++或者--在前 先执行++或者-- 在执行其他的
        // 如果++或者--在后 先执行其他的在执行++或者--
        int c = 10;
        c++;
        System.out.println("c = " + c);
        c--;
        System.out.println("c = " + c);

        int d =10;
        ++d;
        System.out.println("d = " + d);
        --d;
        System.out.println("d = " + d);

        int e = 10;
        int f = e++;
        System.out.println("f = " + f); // 10

        int g = 10;
        int h = g--;
        System.out.println("h = " + h); // 10

        int i = 10;
        int j = ++i;
        System.out.println("j = " + j); // 11

        int k = 10;
        int l = --k;
        System.out.println("l = " + l); // 9
    }
}
