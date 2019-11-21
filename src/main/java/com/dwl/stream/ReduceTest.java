package com.dwl.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author duwenlei
 **/
public class ReduceTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();

        int sum = stream.filter(x -> x < 5).reduce(0, Integer::sum);
        System.out.println(sum);

        String reduceStr = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        System.out.println(reduceStr);

        Double d = Stream.of(0.3, 3.5, 6.7, 0.01, 0.09, 0.12).reduce(Double::min).get();
        System.out.println(d);
    }
}
