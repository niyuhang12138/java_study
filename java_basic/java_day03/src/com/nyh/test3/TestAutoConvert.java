package com.nyh.test3;

/**
 * @author 28304
 * @date 2025/5/31
 * @description
 * 自动类型转换：自动类型提升
 *  1.两种类型要相互兼容 数值与数值之间的相互兼容 short兼容byte、int兼容short
 *  1.目标类型（等号左边）取值范围大于源类型（等号右边）取值范围
 *
 *  补充：因为chat类型也可以直接存储整数 所占用两个字节所以也可以跟兼容的数值类型进行类型转换
 *  比如 int long float double
 *
 *  补充：整数类型转换成浮点类型的时候 会自动补零
 */
public class TestAutoConvert {
    public static void main(String[] args) {
        byte b1 = 10;
        short s1 = b1;
        System.out.println("s1 = " + s1);
        int i1 = s1;
        System.out.println("i1 = " + i1);
        long l1 = i1;
        System.out.println("l1 = " + l1);
        float f1 = b1;
        System.out.println("f1 = " + f1);
        double d1 = l1;
        System.out.println("d1 = " + d1);
        float f2 = l1;
        System.out.println("f2 = " + f2);

        char c1 = 'a';
        int i2 = c1;
        System.out.println("i2 = " + i2);
    }
}
