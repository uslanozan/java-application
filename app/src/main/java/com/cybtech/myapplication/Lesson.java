package com.cybtech.myapplication;

public class Lesson {
    private String courseName,instName,courseDate,courseTime;

    public Lesson(String courseName, String instName, String courseDate, String courseTime) {
        this.courseName = courseName;
        this.instName = instName;
        this.courseDate = courseDate;
        this.courseTime = courseTime;
    }

    public void printLessons(){
        System.out.println("Ders adı="+courseName);
    }

    public void printLessons(String dersIcerigi){
        System.out.println("Ders adı="+courseName);
        System.out.println("Ders içeriği="+dersIcerigi);
    }
    public void printLessons(String dersIcerigi,int islencekSayfa){
        System.out.println("Ders adı="+courseName);
        System.out.println("Ders içeriği="+dersIcerigi);
        System.out.println("Sayfa="+islencekSayfa);
    }
}
