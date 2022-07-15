package com.kartik.introduction;

import com.kartik.packages.Human;

import static com.kartik.packages.Message.message;

public class LectureTwo {
    public static void main(String[] args) {
        System.out.println("The code from Lecture 2!");
        message();

        Human human1 = new Human("Kartik", 20, 2000, false);
        Human human2 = new Human("Kunal", 22, 3000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
