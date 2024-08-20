package com.spring;

public class Student {
    private int rollNum;
    private String name;
    private String city;
    public int getRollNum() {
        return rollNum;
    }
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "Student [rollNum=" + rollNum + ", name=" + name + ", city=" + city + "]";
    }
    
}
