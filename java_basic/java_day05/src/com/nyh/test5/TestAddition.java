package com.nyh.test5;

/**
 * @author 28304
 * @date 2025/6/10
 * @description
 */
public class TestAddition {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (sum > 20) {
                System.out.println("i大于20，跳出循环");
                break; // 当 i 大于 20 时，跳出循环
            }
            sum += i; // 累加 i 的值
        }
        System.out.println("0到10的累加和为：" + sum);
    }
}
