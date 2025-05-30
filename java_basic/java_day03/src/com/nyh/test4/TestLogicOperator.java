package com.nyh.test4;

/**
 * @author 28304
 * @date 2025/5/31
 * @description 逻辑运算符：
 * & 与      要求两个或者多个条件同时成立 则最终结果为true
 * && 短路与  要求两个或者多个条件同时成立 则最终结果为true
 * 短路与 有短路的效果 如果前面的条件不成立 则后续的条件不执行
 * 与 没有短路的效果 如果前面的条件结果如何 都将执行完所有条件
 * <p>
 * | 或      要求两个或者多个条件 至少有一个成立 则最终结果为true
 * || 短路或  要求两个或者多个条件 至少有一个成立 则最终结果为true
 * 短路或 有短路的效果 如果前面的条件成立 则后续条件不执行
 * 或 没有短路的效果 如果前面的条件执行 都将执行完所有条件
 * <p>
 * ！非       取反
 * <p>
 * 移动整行代码：shift + alt + ↑↓
 */
public class TestLogicOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println(a < b & b > c); // true
        System.out.println(a < b && b > c); // true

        System.out.println("-----------------------");

        System.out.println(a < b & b < c); // false
        System.out.println(a < b && b < c); // false

        System.out.println("-----------------------");

        System.out.println(a < b | b < c); // true
        System.out.println(a < b || b < c); // true

        System.out.println("-----------------------");
        System.out.println(a > b | b < c); // false
        System.out.println(a > b || b < c); // false

        System.out.println("-----------------------");
        boolean flag = true;
        System.out.println(!flag);
    }
}
