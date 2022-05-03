package com.example.springdemo;

public class Friend {

    private int id;
    private String name;
    private String adress;
    private String number;

    public Friend(){}

    public Friend(int id, String name, String adress, String number) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
