package com.hiooih.day21;

/**
 * @author duwenlei
 **/
public class Student {
    private String name;
    private Integer score;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, Integer score, Integer age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
}
