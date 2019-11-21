package com.dwl.day15;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author duwenlei
 **/
public class StreamTest {
    public static void main(String[] args) {
        //List<Integer> nums = Arrays.asList(1, 23, 4, 5, 6, 111, 634, 3456, 356, 35, 356, 356, 356, 356, 3, 56, 52, 3, 23, 12, 31, 2, 1, 3);

//        int sum = nums.stream()
//                .map(e -> e * 2)
//                .reduce(0, (e1, e2) -> e1 + e2);
//        System.out.println(sum);

        Stream<String> stream = Stream.of("hello", "world", "hello world");
        String[] arr = stream.toArray(String[]::new);
//
//        Stream.of(arr)
//                .forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toList());
//        list.forEach(System.out::println);

    }
}
