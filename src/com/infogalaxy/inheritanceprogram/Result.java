package com.infogalaxy.inheritanceprogram;

public class Result extends Internal{
    int perc;
    int total;
    void setPerc(){
        //System.out.println("Enter The Percentage : ");
        //perc = sc.nextInt();
        total = im1 + im2;
        perc = total/2;
    }
    void getResult(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("M1 Mark : "+im1);
        System.out.println("M2 Mark : "+im2);
        System.out.println("Total Marks : "+total);
        System.out.println("Percentage : "+perc);
    }
}
class Main {
    public static void main(String[] args) {
        Result result = new Result();
        result.setStudent();
        result.setMarks();
        result.setPerc();
        result.getResult();
    }
}
