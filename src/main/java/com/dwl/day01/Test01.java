package com.dwl.day01;

/**
 * @author duwenlei
 **/
public class Test01 {


    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.test01(() -> System.out.println("2"));
    }


    public void test01(MyInterface01 interface01) {
        System.out.println("1");
        interface01.method01();
        System.out.println("3");
    }
}

@FunctionalInterface
interface MyInterface01 {

    /**
     *
     *
     */
    void method01();
}
