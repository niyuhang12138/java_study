package com.nyh.test6;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/4
 * @description
 * 嵌套if：一个完整的if结构中 嵌套另外一个if结构 支持任意组合
 * 格式正确的情况 支持任意 通常不会通过三层
 *
 * 需求：学校举行百米跑步比赛 根据跑步事件决定是否可以进入决赛 跑步时间小于14s
 * 然后根据性别进行分组 男子组还是女子组
 */
public class TestInnerIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入您的跑步时间（秒）：");
        double time = scanner.nextDouble();


        if (time < 14) {
            System.out.println("恭喜您进入决赛！");

            System.out.print("您的性别：");
            String sex = scanner.next();


            // 对字符串进行判断 必须使用equals方法
            if (sex.equals("男")) {
                System.out.println("您进入男子组决赛。");
            } else if (sex.equals("女")) {
                System.out.println("您进入女子组决赛。");
            } else {
                System.out.println("您的性别不太合适。");
            }
        } else {
            System.out.println("很遗憾，您没有进入决赛。");
        }
    }
}
