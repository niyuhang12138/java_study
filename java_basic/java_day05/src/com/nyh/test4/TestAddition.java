package com.nyh.test4;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/10
 * @description
 */
public class TestAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int number = scanner.nextInt();

        for (int i = 0, j = number; i <= number && j >= 0; i++, j--) {
            int sum = i + j; // 计算 i 和 j 的和
            System.out.println(i + " + " + j + " = " + sum);
        }

        for (int i = 0; i <= number; i++) {
            int sum = i + (number - i); // 计算 i 和 (number - i) 的和
            System.out.println(i + " + " + (number - i) + " = " + sum);
        }

    }
}
