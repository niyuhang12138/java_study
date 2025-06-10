package com.nyh.test3;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/10
 * @description
 * DoWhile循环：先执行后判断不管条件是否满足 都会至少执行一次循环体
 */
public class TestCheckStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("请输入你的学习任务是否合格？ (y/n): ");
            answer = scanner.next();
        }while (!answer.equals("y"));

        System.out.println("程序结束");
    }
}
