package com.hiooih.day17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author duwenlei
 **/
public class StreamTest1 {
    public static void main(String[] args) {
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4, 5), Arrays.asList(6, 7));

        stream.flatMap(List::stream)
                .forEach(System.out::println);

        Stream<Integer> stream1 = Stream.iterate(1, e -> e + 1).limit(1000);
        stream1.forEach(System.out::println);
    }
}
