package com.hiooih.day18;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 * @author duwenlei
 **/
public class StreamTest {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, e -> e + 1).limit(6);

        System.out.println(stream.filter(e -> e > 2).skip(2).limit(2).mapToInt(e -> e * e).sum());

        IntSummaryStatistics intSummaryStatistics = stream.filter(e -> e > 2).skip(2).limit(2).mapToInt(e -> e * e).summaryStatistics();
    }
}
