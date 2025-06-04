package com.nyh.test4;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/4
 * @description
 * 根据用户的输入的年龄 根据年龄判断 用户是否成年
 */
public class TestInputAge {
    public static void main(String[] args) {
        // Alt + Enter 掳爱苏导包
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您的年龄：");

        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("您已经成年了。");
        } else {
            System.out.println("您还未成年。");
        }
    }
}
