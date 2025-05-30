package com.nyh.test3;

/**
 * @author 28304
 * @date 2025/5/31
 * @description 强制类型转换：
 * 1.两种类型要相互兼容 数值与数值相互兼容
 * 2.目标类型取值范围要小于源类型
 */
public class TestForceConvert {
    public static void main(String[] args) {
        short s1 = 100;
        byte b1 = (byte) s1;
        System.out.println("b1 = " + b1);

        int i1 = 100;
        short s2 = (short) i1;
        System.out.println("s2 = " + s2);

        float f1 = 100.123F;
        int i2 = (int) f1;
        System.out.println("i2 = " + i2);

        double d1 = 100.123D;
        int i3 = (int) d1;
        System.out.println("i3 = " + i3);
        long l1 = (int) d1;
        System.out.println("l1 = " + l1);

        int i4 = 100;
        byte b2 = (byte) i4;
        System.out.println("b2 = " + b2);
    }
}
