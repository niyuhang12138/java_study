package com.nyh.test4;

/**
 * @author 28304
 * @date 2025/5/31
 * @description 三目运算符：根据布尔表达式的结果选择执行 结果1 或者 结果2
 */
public class TestThreeElementOperator {
    public static void main(String[] args) {
        int age = 12;
        System.out.println(age > 18 ? "成立了" : "不成立");

        int a = 10;
        int b = a > 5 ? 5 : 6;
        System.out.println("b = " + b);
    }
}
