package com.kartik.introduction;

public class Main {
    public static void main(String[] args) {

        // Kunal Kushwaha's OOP Video 1
        System.out.println("Object Oriented Programming!");

        // Creating objects of Classes
        Student student1 = new Student(1, "Kartik", 69.21f);
        Student student2 = new Student(2, "John", 99.2f);

        // Calling a method to change the name
        String exampleName = "Marry";
        student1.changeName(exampleName);

        student1.greetings();
        student2.greetings();

        // Creating an object from other object
        Student random = new Student(student1);

        random.greetings();

        student1.printDetails();
        student2.printDetails();
        random.printDetails();

        Student student3 = new Student();
        student3.printDetails();
    }

    static class Student {
        int rollNumber;
        String name;
        float marks;

        Student (int rollNumber, String name, float marks) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.marks = marks;
        }

        Student () {
            // Constructor calling another constructor
            this (0, "Default", 100.0f);
        }

        void greetings() {
            System.out.println("Good Morning " + this.name);
        }

        void changeName(String name) {
            this.name = name;
        }

        // Constructor accepting same Class object
        Student (Student otherStudent) {
            this.marks = otherStudent.marks;
            this.name = otherStudent.name;
            this.rollNumber = otherStudent.rollNumber;
        }

        void printDetails() {
            System.out.println("Roll No. : " + this.rollNumber + " Name : " + this.name + " Marks : " + this.marks);
        }
    }
}
