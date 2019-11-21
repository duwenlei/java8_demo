package com.dwl.day02;

import java.util.function.BiFunction;

/**
 * @author duwenlei
 **/
public class Function1 {
    public static void main(String[] args) {
        // BiFunction test
        Function1 function = new Function1();

        System.out.println(function.compose(1, 2, Integer::sum));


    }

    public int compose(int a, int b, BiFunction<Integer, Integer, Integer> function) {
        return function.apply(a, b);
    }
}
