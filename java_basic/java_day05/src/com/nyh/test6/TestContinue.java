package com.nyh.test6;

/**
 * @author 28304
 * @date 2025/6/10
 * @description
 */
public class TestContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("i等于5，跳过本次循环");
                continue; // 当 i 等于 5 时，跳过本次循环
            }
            System.out.println("第" + i + "次好好学习");
        }
        System.out.println("程序结束");
    }
}
