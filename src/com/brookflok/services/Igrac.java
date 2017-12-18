package com.brookflok.services;



public class Igrac implements com.brookflok.interfaces.Igrac{

   private String name;
   private String surname;
   private int age;
   private int jerseyNumber;
   private Boolean hasBall=false;

    public Igrac(String name, String surname, int age, int jersyNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.jerseyNumber = jersyNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public Boolean getHasBall() {
        return hasBall;
    }

    public void setHasBall(Boolean hasBall) {
        this.hasBall = hasBall;
    }
}
