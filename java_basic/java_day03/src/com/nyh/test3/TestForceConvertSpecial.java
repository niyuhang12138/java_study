package com.nyh.test3;

/**
 * @author 28304
 * @date 2025/5/31
 * @description
 * 强制类型转换的特殊情况：将超出目标类型的数值进行转换
 *
 * 原码 反码 补码
 * 计算机统一以补码的形式表示所有的整数
 *
 * 原码 即我们人能够直接看明白的表示形式符号位为0表示正数 为1表示负数 其余为对应的十进制数值进行累计
 * 反码 在原码的基础上 符号位不变 其余各位取反
 * 补码 在反码的基础上 + 1
 *
 * 注意：正数的原码、反码、补码是一致的
 * 注意：计算机计算出来的都是补码
 */
public class TestForceConvertSpecial {
    public static void main(String[] args) {
        short s1 = 257;
        byte b1 = (byte) s1;
        System.out.println("b1 = " + b1); // 1

        short s2 = 128;
        byte b2 = (byte) s2;
        System.out.println("b2 = " + b2); // -128

        short s3 = 129;
        byte b3 = (byte) s3;
        System.out.println("b3 = " + b3); // -127
    }
}
