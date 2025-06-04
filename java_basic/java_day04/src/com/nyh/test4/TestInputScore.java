package com.nyh.test4;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/4
 * @description
 */
public class TestInputScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您的Java成绩：");
        int javaScore = scanner.nextInt();
        System.out.print("请输入您的数据库成绩：");
        int dbScore = scanner.nextInt();
        System.out.print("请输入您的前端成绩：");
        int frontEndScore = scanner.nextInt();

        if (javaScore >= 60 && dbScore >= 80 && frontEndScore == 100) {
            System.out.println("恭喜您，您通过了考试！");
        } else {
            System.out.println("很遗憾，您没有通过考试。");
            if (javaScore < 60) {
                System.out.println("Java成绩不及格，请努力提高。");
            }
            if (dbScore < 80) {
                System.out.println("数据库成绩不及格，请努力提高。");
            }
            if (frontEndScore != 100) {
                System.out.println("前端成绩不满分，请努力提高。");
            }
        }
    }
}
