package com.example;

import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
        
        Gson gson = new Gson();

        Person person = new Person("Luis" , 20 , true);

        String json = gson.toJson(person);

        System.out.print(json);
        //Continuar diapo 32
    }
}