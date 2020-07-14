package com.hiooih.day20;

import java.util.Arrays;
import java.util.List;

/**
 * @author duwenlei
 **/
public class StreamTest1 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello world", "world hello", "hello world hello", "hello welcome");

        // flatMap 函数接收一个值，返回一个Stream
        list.stream()
                .flatMap(e -> Arrays.stream(e.split(" ")))
                .distinct()
                .forEach(System.out::println);
    }
}
