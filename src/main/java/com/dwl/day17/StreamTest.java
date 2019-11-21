package com.dwl.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author duwenlei
 **/
public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "helloworld");
        list = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));

        list.forEach(System.out::println);
    }
}
