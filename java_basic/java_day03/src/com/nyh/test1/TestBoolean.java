package com.nyh.test1;

/**
 * boolean类型 仅能描述true或者false
 * true表示为真 false表示为假
 * boolean类型可以直接赋值true/false也可以赋值结果为true或者false的表达式
 */
public class TestBoolean {
    public static void main(String[] args) {
        boolean bl1 = true;
        System.out.println("bl1 = " + bl1);

        boolean bl2 = false;
        System.out.println("bl2 = " + bl2);

        int a = 10;
        int b = 20;
        boolean bl3 = a < b;
        System.out.println("bl2 = " + bl3);

        boolean bl4 = a > b;
        System.out.println("bl4 = " + bl4);
    }
}
