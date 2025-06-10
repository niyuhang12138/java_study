package com.nyh.test3;

/**
 * @author 28304
 * @date 2025/6/10
 * @description DoWhile循环：先执行后判断不管条件是否满足 都会至少执行一次循环体
 * while循环和do while循环的区别在于：
 * while循环是先判断条件在执行循环体
 * do while循环是先执行循环体再判断条件 不管条件是否满足 都会至少执行一次循环体
 */
public class TestDoWhile {
    public static void main(String[] args) {
        int i = 1; // 计数器初始化

        do {
            System.out.println("第" + i + "次好好学习");
            i++; // 计数器更新
        } while (i <= 100); // 循环条件

        System.out.println("程序结束");
    }
}
