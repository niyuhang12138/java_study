package com.nyh.test1;

/**
 * @author 28304
 * @date 2025/6/3
 * @description
 * 位运算符
 * << 左移：左移几位表示乘以2的几次方 有可能会出现负数的情况
 * << 右移：右移几位表示除以2
 *      如果最高位是1 空出来补1
 *      如果最高位是0 空出来补0
 * >>> 无符号右移：不管最高位是0还是1 空缺位以0填充 最终的结果都是一个正式
 *      应用场景：比如我们要获取某个元素应该存放在数组的位置 可以使用无符号右移 因为无符号右移绝对不可能得到一个负数
 * & 与 两个数相同二进制位 都为1 则为1 其他情况最终结果都为0
 * | 或 两个数相同二进制位 任意有一个为1 则都为1 其他情况都为0
 * ^ 异或 两个数相同二进制位 不同为1 相同为0
 * ~ 取反 包括符号为在内每一位取反
 */
public class TestBinaryOperator {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a << 1);
        System.out.println(a << 2);
        System.out.println(a << 3);
        System.out.println(a << 31);
        System.out.println(a << 32);

        System.out.println("---------------");

        System.out.println(8 >> 1);
        System.out.println(8 >> 2);
        System.out.println(8 >> 3);
        System.out.println(8 >> 4);
        System.out.println(8 >> 5);

        System.out.println(-20 >> 1);
        System.out.println(-20 >> 2);
        System.out.println(-20 >> 3);
        System.out.println(-20 >> 4);
        System.out.println(-20 >> 5);
        System.out.println(-20 >> 6);

        System.out.println("-----------------");
        System.out.println(-20 >>> 1);
        System.out.println(-20 >>> 2);

        System.out.println("`-----------------");
        System.out.println(8 & 3); // 0b1000 & 0b0011 = 0b0000

        System.out.println("-----------------");
        System.out.println(8 | 3); // 0b1000 | 0b0011 = 0b1011

        System.out.println("-----------------");
        System.out.println(8 ^ 3); // 0b1000 ^ 0b0011 = 0b1011

        System.out.println("-----------------");
        System.out.println(~8); // 0b1000 = 0b11111111111111111111111111111000 = -9
    }
}