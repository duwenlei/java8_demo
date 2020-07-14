package com.hiooih.day08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author duwenlei
 **/
public class Test {
    public static void main(String[] args) {
        Student s = new Student("zhangsan", 12);
        Student s1 = new Student("lisi", 13);
        Student s2 = new Student("wangwu", 24);
        Student s3 = new Student("zhaoliu", 9);

        List<Student> students = Arrays.asList(s, s1, s2, s3);
        List<Student> filters = students.stream().filter(e -> {
            return e.getUsername().equals("zhangsan");
        }).collect(Collectors.toList());
        filters.forEach(e -> {
            System.out.println(e.getUsername());
            System.out.println(e.getAge());
        });

    }
}
