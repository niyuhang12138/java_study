package com.nyh.test2;

/**
 * @author 28304
 * @date 2025/6/4
 * @description
 * 局部变量：
 *  定义位置：定义在方法体内
 *  作用范围：离当前变量最近的大括号以内
 *  重名问题：重合的作用范围以内 不能重名
 *  默认值：局部变量没有默认值 必须先赋值才能使用
 *
 *  生命周期：随着方法的入栈而生效 随着方法的出栈而失效
 *  存储位置：基本数据类型存储在栈中 引用数据类型名称存储在栈中值存储在堆中（栈中的引用指向堆中的空间（指针））
 */
public class TestLocalVariable {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int d;
        // System.out.println("d = " + d); // 不能访问d 因为d没有赋值

        if (a > b) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            // int a = 100; 重合的作用范围内不能重名
            int c = 123;
        } else {
            // System.out.println("c = " + c); // 不能访问c 因为c的作用范围只在if语句块内
            int c = 234;
            System.out.println("c = " + c); // 这里可以定义
        }
        // System.out.println("c = " + c); // 不能访问c 因为c的作用范围只在if 或者 else语句块内
    }
}
