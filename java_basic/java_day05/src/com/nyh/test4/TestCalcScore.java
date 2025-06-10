package com.nyh.test4;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/10
 * @description
 */
public class TestCalcScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您的名字：");
        String name = scanner.next();

        double sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入第 " + i + " 门课的成绩：");
            double score = scanner.nextDouble();
            sum += score; // 累加成绩
        }

        double average = sum / 5; // 计算平均成绩
        System.out.println(name + " 的平均成绩是：" + average);
    }
}
