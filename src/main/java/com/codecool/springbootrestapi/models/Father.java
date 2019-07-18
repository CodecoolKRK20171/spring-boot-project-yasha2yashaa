package com.codecool.springbootrestapi.models;


import java.util.List;

public class Father {
    private long id;
    private String firstName;
    private String secondName;
    private int wealth;
    private List<Long> sonsIds;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public List<Long> getSonsIds() {
        return sonsIds;
    }

    public void setSonsIds(List<Long> sonsIds) {
        this.sonsIds = sonsIds;
    }
}
