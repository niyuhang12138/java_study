package com.nyh.test1;

/**
 * 浮点类型: 这两种类型都是近似值 不是精确值 如需使用精确值 使用后续学习的BigDecimal类
 * float
 * double
 */
public class TestFloatDouble {
    public static void main(String[] args) {
        float f1 = -1.1F;
        System.out.println("f1 = " + f1);

        float f2 = 1.1F;
        System.out.println("f2 = " + f2);

        // 给double类型赋值 如果查出了float的取值范围需要加上一个D
        double d1 = 1.1D;
        System.out.println("d1 = " + d1);
        
        double d2 = -1.1D;
        System.out.println("d2 = " + d2);
    }
}
