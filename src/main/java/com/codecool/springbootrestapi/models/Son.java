package com.codecool.springbootrestapi.models;

import javax.persistence.*;

@Table(name="sons")
@Entity
public class Son {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    @Column(name="firstName")
    private
    String firstName;
    @Column(name="secondName")
    private
    String secondName;
    @Column(name="diminutiveName")
    private
    String diminutiveName;
    @Column(name="dadFavorLevel")
    private
    int dadFavorLevel;

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

    public String getDiminutiveName() {
        return diminutiveName;
    }

    public void setDiminutiveName(String diminutiveName) {
        this.diminutiveName = diminutiveName;
    }

    public int getDadFavorLevel() {
        return dadFavorLevel;
    }

    public void setDadFavorLevel(int dadFavorLevel) {
        this.dadFavorLevel = dadFavorLevel;
    }
}