package com.nyh.test5;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/10
 * @description
 */
public class TestCalcScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        boolean flag = true; // 用于标记成绩输入是否有效

        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入第 " + i + " 门课的成绩：");
            double score = scanner.nextDouble();

            if (score < 0 || score > 100) {
                System.out.println("成绩输入错误，请输入0-100之间的成绩。");
                flag = false;
                break;
            }
            sum += score; // 累加成绩
        }

        if (flag) {
            double avg = sum / 5; // 计算平均成绩
            System.out.println("您的平均成绩是：" + avg);
        } else {
            System.out.println("由于输入错误，无法计算平均成绩。");
        }
        System.out.println("程序结束");
    }
}
