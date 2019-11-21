package com.dwl.day10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author duwenlei
 **/
public class Function {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function function = new Function();
//        function.conditionFilter(nums, num -> num > 5, num -> num % 2 == 0);

        nums.stream()
                .filter(num -> num > 5)
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    public void conditionFilter(List<Integer> nums, Predicate<Integer> predicate, Predicate<Integer> predicate1) {
        for (Integer num : nums) {
            if (predicate.and(predicate1).test(num)) {
                System.out.println(num);
            }
        }

    }
}
