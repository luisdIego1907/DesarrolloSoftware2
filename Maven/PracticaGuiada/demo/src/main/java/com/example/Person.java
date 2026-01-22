package com.example;

public class Person {

    private String name;
    private int age;
    private boolean isStudent;
    private int id;

    public Person(){

    }

    public Person(String name , int age , boolean isStudent , int id){
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
        this.id = id;
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

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    
    @Override
    public String toString(){

        return " Name: " + name + " Edad: " + age + " isStudent: " + isStudent + " Id: " + id;
    }
}
