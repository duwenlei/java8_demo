package com.dwl.day48;

import java.time.LocalDateTime;

/**
 * @author duwenlei
 **/
public class DateTest {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime1 = dateTime.minusYears(2).withMonth(3);
        System.out.println(dateTime1);



    }
}
