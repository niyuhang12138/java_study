package com.nyh.test3;

/**
 * @author 28304
 * @description TODO
 * @date 2025/5/29
 * 变量的定义
 * 方式1：先声明在赋值
 * 方式2：连声明带赋值
 * 方式3：同时声明多个同类型变量
 */
public class TestVariableDefine {
    public static void main(String[] args) {
        // 方式1：先声明 在赋值
        int a;
        a = 100;
        System.out.println("变量a的取值为：" + a);

        // 方式2：连声明带赋值
        int b = 100;
        System.out.println("变量b的取值为：" + b);

        // 方式3：同时声明多个同类型的变量
        // 未赋值的局部变量是不能使用的
        int c,d,e = 50,f,g = 100;
        System.out.println("变量e的取值为：" + e);
    }
}
