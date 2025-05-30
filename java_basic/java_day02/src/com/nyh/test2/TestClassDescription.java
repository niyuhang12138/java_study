package com.nyh.test2;

/**
 * @author 28304
 * @description TODO
 * @date 2025/5/29
 * 同一个源文件中可以定义多个类
 * 编译后每个类都会生成独立的class文件
 * 一个类中只能有一个main方法
 * public修饰的类被成为公开类，要求类名必须与文件名完全相同，包含大小写
 * 同一个源文件中只能有一个公开类
 */
public class TestClassDescription {
    public static void main(String[] args) {

    }
}

class B {
    public static void main(String[] args) {

    }
}

class C {
    public static void main(String[] args) {

    }
}
