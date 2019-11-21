package com.dwl.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * @author duwenlei
 **/
public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);
        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }
        System.out.println("开始排序");
        long startTime = System.nanoTime();
//        list.parallelStream().sorted().count();
        list.stream().sorted().count();
        long endTime = System.nanoTime();

        System.out.println(TimeUnit.NANOSECONDS.toMillis(endTime - startTime));
    }
}
