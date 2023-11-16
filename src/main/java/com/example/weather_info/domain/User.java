package com.example.weather_info.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity(name = "usr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;



    private String name;
    private String password;
    private String city;
    private boolean admin;
    public User(){

    }
    public User (String name, String password,String city,boolean admin){
        this.name = name;
        this.password = password;
        this.city = city;
        this.admin = admin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
