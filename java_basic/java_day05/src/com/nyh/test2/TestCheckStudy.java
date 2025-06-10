package com.nyh.test2;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/10
 * @description
 */
public class TestCheckStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("请输入你的学习任务是否合格？ (y/n): ");
            String answer = scanner.next();
            if (answer.equals("y")) {
                System.out.println("恭喜你，学习任务合格！");
                break; // 退出循环
            } else if (answer.equals("n")) {
                System.out.println("请继续努力，学习任务不合格！");
            } else {
                System.out.println("输入无效，请输入 'y' 或 'n'。");
            }
        }

        System.out.println("程序结束");
    }
}
