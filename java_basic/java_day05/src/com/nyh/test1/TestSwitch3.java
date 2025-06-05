package com.nyh.test1;

/**
 * @author 28304
 * @date 2025/6/5
 * @description
 */
public class TestSwitch3 {
    public static void main(String[] args) {
        byte b1= 1;
        short s1 = 1;
        int i1= 1;
        char c1 = '1'; // char 类型有三种赋值方式 case 值也有三种写法 0~65535 / 字符 / Unicode 值
        char c2 = 'a';
        char c3 = '一';
        String str1 = "1";

        switch (c3) {
            case 1:
                System.out.println("b1 is 1");
                break;
            case 49: // '1' 的 ASCII 值是 49
                System.out.println("b1 is 49");
                break;
            case 'a':
                System.out.println("b1 is a");
                break;
            case '\u4e00': // '一' 的 Unicode 值是 \u4e00
                System.out.println("b1 is 一");
                break;
//            case "1":
//                System.out.println("b1 is 1 (String)");
//                break;
            default:
                System.out.println("b1 is not 1");
                break;
        }
    }
}
