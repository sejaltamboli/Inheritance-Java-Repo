package com.infogalaxy.inheritanceprogram;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    void setStudent() {
        System.out.println("Enter the Student Id and Name: ");
        id = sc.nextInt();
        name = sc.next();
    }
}
class Result extends Student {
    void getResult () {
        System.out.println("Student ID is: " + id);
        System.out.println("Student Name is: " + name);
    }
}
class Main {
    public static void main(String[] args) {
        Result result = new Result();
        result.setStudent();
        result.getResult();
    }
}