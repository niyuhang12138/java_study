package com.nyh.test2;

/**
 * @author 28304
 * @date 2025/6/10
 * @description
 * While循环 当条件为真时，执行循环体
 * 任何循环都有四个必不可少的部分：
 * 1.计数器初始化
 * 2.循环条件
 * 3.循环体
 * 4.计数器更新
 *
 * while循环可以用于处理循环次数确定和不确定的情况
 *  通常用于处理不确定的循环次数  确定次数的循环使用for循环更加简洁
 *  while循环的提点是先判断在执行
 */
public class TestWhile {
    public static void main(String[] args) {
        int i = 1; // 计数器初始化

        // 循环条件
        // 当 i 小于等于 5 时，执行循环体
        while (i <= 100) {
            System.out.println("第" + i + "次好好学习");
            i++; // 计数器更新
        }
        System.out.println("程序结束");
    }
}
