package com.dwl.day21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author duwenlei
 **/
public class StreamTest {
    /**
     * 由多个 Stream 打平，成为一个 Stream
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "Hello", "你好");
        List<String> list1 = Arrays.asList("dwl", "sg", "Tony");

        List<String> result = list.stream()
                .flatMap(h -> list1.stream().map(e -> h + "\t" + e))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
