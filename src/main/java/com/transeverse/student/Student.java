package com.transeverse.student;

public class Student {
    public static double count;
    public static double sumOfRating;

    public static double getAverageRating() {
        return averageRating;
    }

    public static double averageRating;
    private String name;
    private int rating;

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        count++;
        sumOfRating = (sumOfRating + rating);
        averageRating = sumOfRating/count;
    }

    public Student(String name) {
        this.name = name;
        count++;
        sumOfRating = (sumOfRating + rating);
        averageRating = sumOfRating/count;
    }

    public Student() {
        count++;
        averageRating = (sumOfRating + rating)/count;
    }

    public boolean isBetterStudentThan(Student valerka) {
        return this.getRating() > valerka.getRating();
    }

    public String toString() {
        return "Name: " + this.getName() + " rating: " + this.getRating();
    }

    public void changeRating(int rating) {
        sumOfRating -= this.getRating();
        this.setRating(rating);
        sumOfRating += rating;
        averageRating = sumOfRating/count;
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

    public static void removeStudent(Student student) {
        student = null;
    }
}
