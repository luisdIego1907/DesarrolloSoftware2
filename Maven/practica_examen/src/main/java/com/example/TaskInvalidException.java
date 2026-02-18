package com.example;

public class TaskInvalidException extends RuntimeException {

    public TaskInvalidException(String message){
        super(message);
    }
}
