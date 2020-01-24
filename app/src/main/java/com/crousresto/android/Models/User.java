package com.crousresto.android.Models;


/**
 * Created by Nygma on 23/01/2020.
 */

public class User {
    public String name, email, phone,ine,password;

    public User(){

    }

    public User(String name, String email, String phone,String ine,String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.ine=ine;
        this.password=password;
    }
}
