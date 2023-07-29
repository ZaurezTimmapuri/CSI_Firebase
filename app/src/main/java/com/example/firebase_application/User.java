package com.example.firebase_application;

public class User {
    String email,name,roll_number;

    public  User(){}

    public User(String email, String name, String roll_number) {
        this.email = email;
        this.name = name;
        this.roll_number = roll_number;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
    }
}
