package com.dwl.day21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author duwenlei
 **/
public class StreamTest1 {
    public static void main(String[] args) {
        Student s0 = new Student("张三", 12, 30);
        Student s1 = new Student("李四", 45, 30);
        Student s2 = new Student("王五", 36, 10);
        Student s3 = new Student("张三", 12, 30);

        List<Student> students = Arrays.asList(s0, s1, s2, s3);

        Map<String, List<Student>> g0 = students.stream()
                .collect(Collectors.groupingBy(Student::getName));
        System.out.println(g0);

        Map<String, Long> g1 = students.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        System.out.println(g1);

        Map<String, Double> g2 = students.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        System.out.println(g2);

        Map<Boolean, List<Student>> g3 = students.stream()
                .collect(Collectors.partitioningBy(e -> e.getScore() > 40));
        System.out.println(g3);
    }
}
