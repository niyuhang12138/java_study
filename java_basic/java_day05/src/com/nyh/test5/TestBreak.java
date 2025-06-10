package com.nyh.test5;

/**
 * @author 28304
 * @date 2025/6/10
 * @description
 * break: 可以用于在switch和循环结构中 跳出结构
 * 未执行完的循环次数和循环体内容不再执行 通常结合分支语句使用
 */
public class TestBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 50) {
                System.out.println("i等于50，跳出循环");
                break; // 当 i 等于 50 时，跳出循环
            }
            System.out.println("第" + i + "次好好学习");
        }
        System.out.println("程序结束");
    }
}
