package com.nyh.test6;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/10
 * @description
 */
public class TestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("班级人数：");
        int classSize = scanner.nextInt();

        double count = 0;

        for (int i = 1; i <= classSize; i++) {
            System.out.print("请输入第 " + i + " 个学生的成绩：");
            double score = scanner.nextDouble();

            if (score < 80) {
                continue;
            }

            count++; // 统计成绩大于等于80的学生数量
        }

        System.out.println("成绩大于等于80的学生数量占比：" + classSize / count);
    }
}
