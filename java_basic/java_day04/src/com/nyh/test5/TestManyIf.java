package com.nyh.test5;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/4
 * @description
 * 多重if
 */
public class TestManyIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您的成绩：");
        // 这里使用 double 类型来支持小数成绩 也可以接收int类型 会自动转换
        double score = scanner.nextDouble();

        if (score < 60) {
            System.out.println("您的成绩是：" + score + "，不及格");
        } else if (score < 70) {
            System.out.println("您的成绩是：" + score + "，及格");
        } else if (score < 80) {
            System.out.println("您的成绩是：" + score + "，良好");
        } else if (score < 90) {
            System.out.println("您的成绩是：" + score + "，优秀");
        } else if (score < 100) {
            System.out.println("您的成绩是：" + score + "，非常优秀");
        } else {
            System.out.println("您的成绩是：" + score + "，满分");
        }
    }
}
