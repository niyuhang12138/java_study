package com.nyh.test4;

/**
 * @author 28304
 * @date 2025/5/31
 * @description 赋值运算符： = += -= *= /= %=
 */
public class TestAssignmentOperator {
    public static void main(String[] args) {
        int a = 10; // =
        System.out.println("a = " + a);
        a += 10; // a = a + 10
        System.out.println("a = " + a);
        a -= 10; // a = a - 10
        System.out.println("a = " + a);
        a *= 10; // a = a * 10
        System.out.println("a = " + a);
        a /= 10; // a = a / 10
        System.out.println("a = " + a);
        a %= 10; // a = a % 10
        System.out.println("a = " + a);

        System.out.println("-------------------------");
        short s1 = 10;
        s1 += 10; // 这里JVM帮我们实现了隐式的类型转换
        System.out.println("s1 = " + s1);

        short s2 = 10;
        // s2 = s2 + 10; // 这里我们完整书写表达式进行计算 需要手动类型转换
        s2 = (short) (s2 + 10);
        System.out.println("s2 = " + s2);
    }
}
