package com.nyh.test4;

/**
 * @author 28304
 * @date 2025/6/4
 * @description
 * if else结构：对布尔条件进行判断 条件成立 则执行if结构代码 条件不能离 则执行else结构的代码
 *
 * else结构不能单独出现 必须配合if结构
 */
public class TestIfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a大于b条件成立");
        } else {
            System.out.println("a小于等于b条件成立");
        }

        System.out.println("程序结束");
    }
}
