package com.transeverse;

import com.transeverse.student.Student;

import java.util.Arrays;

public class knowledge {
    public static void main(String[] args) {
        Student s1 = new Student("Valera", 3);
        Student s2 = new Student("Valera1", 4);
        Student s3 = new Student("Valera2", 5);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        int arrayOfRatings[] = {s1.getRating(), s2.getRating(), s3.getRating()};
        System.out.println("Average rating: " + Arrays.stream(arrayOfRatings).average().orElse(Double.NaN));

        s1.changeRating();

        int averageRating2[] = {s1.getRating(), s2.getRating(), s3.getRating()};
        System.out.println("Average rating after it was changed: " + Arrays.stream(averageRating2).average().orElse(Double.NaN));

    }

}


      /*
       Set<Student> collectionOfStudents = new HashSet<>();
        collectionOfStudents.add(s1);
        collectionOfStudents.add(s2);
        collectionOfStudents.add(s3);

        Iterator<Student> itr = collectionOfStudents.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
      */