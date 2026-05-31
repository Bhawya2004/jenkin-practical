package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Student Result App Started");

        ResultCalculator rc = new ResultCalculator();

        int total = rc.addMarks(40,60);

        System.out.println("Total Marks = " + total);
    }
}