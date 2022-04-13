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
class Internal extends Student {
    int im1;
    int im2;

    void setMarks() {
        System.out.println("Enter M1 and M2: ");
        im1 = sc.nextInt();
        im2 = sc.nextInt();
    }
}
