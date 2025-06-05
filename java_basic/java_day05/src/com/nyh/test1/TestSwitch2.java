package com.nyh.test1;

import java.util.Scanner;

/**
 * @author 28304
 * @date 2025/6/5
 * @description
 * switch 结构
 *  支持的数据类型 byte short int char String(JDK7+) 枚举
 *  switch 用于判断某个值属于固定等级的值
 *
 *  break：打破 switch 结构，跳出 switch 语句
 *
 *  default：关键字在switch中是可选的 根据需求是否书写
 *  如果需要每种情况都是相互独立的 所以需要再每个case之后加上 break 语句
 *  因为default的位置不固定 所以也要要求default之后加上break
 *  加上break可以提高代码的可读性
 *
 *  多重if和switch都可以处理连续区间的条件判断和等值的条件判断
 *  但是if更适合区间的判断
 *  switch更适合等值的判断
 */
public class TestSwitch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入你的名次：");

        int rank = input.nextInt();

        switch (rank) {
            case 1:
            case 2:
                System.out.println("1000w！");
                break;
            case 3:
                System.out.println("100w！");
                break;
            default:
                System.out.println("很遗憾，你没有获奖。");
                break;
        }

        System.out.println("程序结束");
    }
}
