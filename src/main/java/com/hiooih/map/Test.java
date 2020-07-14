package com.hiooih.map;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duwenlei
 **/
public class Test {

    public static void test1() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("AA");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("D");
        stringList.add("E");
        stringList.add("AAF");

        stringList
                .stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);

        System.out.println();

        stringList.stream()
                .sorted((e1, e2) -> e1.length() + e2.length())
                .forEach(System.out::println);


    }
}
