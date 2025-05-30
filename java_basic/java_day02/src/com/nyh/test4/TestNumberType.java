package com.nyh.test4;

/**
 * @author 28304
 * @description TODO
 * @date 2025/5/29
 * 整数类型有4种
 * byte 8位
 * short 16位
 * int 32位
 * long 64位
 *
 * Java中的每一个数据都有其对应的数据类型
 * 整数对应int类型
 */
public class TestNumberType {
    public static void main(String[] args) {
        byte b1 = 100;
        System.out.println("b1 = " + b1); // sout回车 自动生成输出语句

        byte b2 = -100;
        System.out.println("b2 = " + b2); // soutv 自动生成打印上一行变量的输出语句

//        byte b3 = 128;

        short s1 = 1000;
        System.out.println("s1 = " + s1);

        short s2 = -1000;
        System.out.println("s2 = " + s2);

        int i1 = 1000;
        System.out.println("i1 = " + i1);

        int i2 = -1000;
        System.out.println("i2 = " + i2);

        long l1 = 1000;
        System.out.println("l1 = " + l1);

        long l2 = -1000;
        System.out.println("l2 = " + l2);

        // int为整数的默认类型 如需为long类型赋值
        // 如果取值范围超出了int 则需要在值的后面追加L
        // 取值范围在int范围之内 则可加可不加
        long l3 = 1000000000000000L;
        System.out.println("l3 = " + l3);
    }
}
