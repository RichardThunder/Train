package com;

import java.util.Random;

public class Main {
public static void main(String[] args) {
    Person.setNumber(99);
    System.out.println();

}
}

class Person {
public static int number;

public static void setNumber(int value) {
    number = value;
    Random random = new Random();
    random.nextInt();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    }
}
}