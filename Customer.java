package com.example.service_f_1;

import org.springframework.stereotype.Repository;

@Repository
public class Customer {
    private String ID;
    private String name;
    private Boolean sex;
    private int age;
    public Customer(){
        this.ID = "";
        this.name = null;
        this.sex = false;
        this.age = 0;
    }
    public Customer(String ID, String n, boolean s, int a){
        this.ID = ID;
        this.name = n;
        this.sex = s;
        if (a < 0){
            a = 0;
        }
        this.age = a;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
