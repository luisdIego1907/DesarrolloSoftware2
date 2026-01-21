package com.example;

public class Person {

    private String name;
    private int age;
    private boolean isStudent;

    public Person(){

    }

    public Person(String name , int age , boolean isStudent){
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean getIsStudent(){
        return isStudent;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setIsStudent(boolean isStudent){
        this.isStudent = isStudent;
    }

    @Override
    public String toString(){

        return " Name: " + name + " Edad: " + age + " isStudent: " + isStudent;
    }
}
