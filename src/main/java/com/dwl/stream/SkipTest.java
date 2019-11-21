package com.dwl.stream;

import java.util.stream.IntStream;

/**
 * @author duwenlei
 **/
public class SkipTest {
    public static void main(String[] args) {
        IntStream.range(0, 20).skip(5).forEach(num -> System.out.println(num));
    }
}
