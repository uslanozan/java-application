package com.cybtech.myapplication;

public class Note extends Lesson {
    private int grade;

    public Note(String courseName, String instName, String courseDate, String courseTime,int grade) {
        super(courseName, instName, courseDate, courseTime);
        this.grade=grade;
    }

    public void printLessons(String dersIcerigi,int islencekSayfa){
        System.out.println("ABC");
        super.printLessons(dersIcerigi,islencekSayfa);
    }
}
