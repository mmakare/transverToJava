package com.transeverse.student;

public class Student {
    private String name;
    private int rating;

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public Student() {
        this.name = name;
        this.rating = rating;
    }

    public boolean isBetterStudentThan(Student valerka) {
        return this.getRating() > valerka.getRating();
    }

    public String toString() {
        return "Name: " + this.getName() + " rating: " + this.getRating();
    }

    public void changeRating() {
        setRating(getRating() + 3);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


}
