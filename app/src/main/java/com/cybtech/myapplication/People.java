package com.cybtech.myapplication;

public class People {
    private String name="Ozan",surname="Uslan",city="Muğla",date="01.04.2003";
    private int age=21;


    public People(String name, String surname, String city, String date, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.date = date;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



