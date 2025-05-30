package com.nyh.test4;

/**
 * @author 28304
 * @date 2025/5/31
 * @description
 */
public class TestLogicOperatorExercise {
    public static void main(String[] args) {
        int x = 8;
        int y = 9;
        System.out.println((++x == y) && (++x != y)); // true
        System.out.println(x); // 10

        int a = 8;
        int b = 9;
        System.out.println((a++ == b) && (++a != b)); // false
        System.out.println(a); // 9

        int c = 8;
        int d = 9;
        System.out.println((c++ == d) & (++c != d)); // false
        System.out.println(10); // 9
    }
}
