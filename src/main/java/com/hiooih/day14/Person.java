package com.hiooih.day14;

/**
 * @author duwenlei
 **/
public class Person {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int compareByScore(Person person) {
        return this.score - person.getScore();
    }

    public int compareByName(Person person) {
        return this.name.compareToIgnoreCase(person.getName());
    }
}
