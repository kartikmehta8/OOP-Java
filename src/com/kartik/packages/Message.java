package com.kartik.packages;

public class Message {
    public static void message() {
        System.out.println("The message is being called from another Class.");
    }

    static int valA = 10;
    static int valB;

    static {
        System.out.println("The function will run once when the first instance of the object will be created!");
        valB = valA * 69;
    }

    public static void main(String[] args) {
        message();
        message();
    }
}
