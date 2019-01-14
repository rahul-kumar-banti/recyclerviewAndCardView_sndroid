package com.example.view.recycle.recycleviewexample;

public class Persion {
    private String name,surname,pref;
    public Persion(String name,String surname,String pref) {
        this.name=name;
        this.pref=pref;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsurname() {
        return surname;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

    public String getPref() {
        return pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }
}
