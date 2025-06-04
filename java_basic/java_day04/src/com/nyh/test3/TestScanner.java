package com.nyh.test3;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/4
 * @description
 * 使用Scanner类 接收用户输入的数据
 * 如果输入类型不匹配的数据 将会出现InputMismatchException异常
 * 异常会中断我们的程序执行
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入您的名字：");

        // =号右侧表示接受用户输入的数据 并且赋值给name变量
        // 当程序执行到这一步 会停下来等待用户的输入
        // 用户输入完毕 按下回车键后 程序继续执行
        String name = input.next();

        System.out.println("您的名字是：" + name);

        System.out.print("请输入您的年龄：");
        int age = input.nextInt();
        System.out.println("您的年龄是：" + age);

        System.out.print("请输入您的身高：");
        double height = input.nextDouble();
        System.out.println("您的身高是：" + height);

        System.out.print("您今天是否开心：");
        boolean isHappy = input.nextBoolean();
        System.out.println("您今天是否开心：" + (isHappy ? "是" : "否"));
    }
}
