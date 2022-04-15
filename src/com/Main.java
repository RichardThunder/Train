package com;

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
}
}