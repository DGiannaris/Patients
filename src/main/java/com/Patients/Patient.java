package com.Patients;

import org.springframework.stereotype.Component;

@Component
public class Patient {

    private int ID;
    private String Name;
    private String Disease;
    private String Address;
    private String tel;
    private String patronum;
    private String AMKA;


    public Patient(int ID, String name, String disease, String address, String tel, String patronum, String AMKA) {
        this.ID = ID;
        Name = name;
        Disease = disease;
        Address = address;
        this.tel = tel;
        this.patronum = patronum;
        this.AMKA = AMKA;
    }

    public Patient() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String disease) {
        Disease = disease;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPatronum() {
        return patronum;
    }

    public void setPatronum(String patronum) {
        this.patronum = patronum;
    }

    public String getAMKA() {
        return AMKA;
    }

    public void setAMKA(String AMKA) {
        this.AMKA = AMKA;
    }
}
