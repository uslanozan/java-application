package com.cybtech.myapplication;

public class Student extends People{
    private int id;
    private String className;


    public Student(int id, String className,String name,String surname,String city,String date,int age) {
        super(name,surname,city,date,age);
        this.id = id;
        this.className = className;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
