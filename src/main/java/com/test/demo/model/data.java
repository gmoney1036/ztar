package com.test.demo.model;


import javax.persistence.*;

@Entity
public class data {
    @Id
    private String mdn;
    private String product;
    private String voice;
    private String sms;

    // No-arg constructor
    public data() {
    }

    // Constructor with fields
    public data(String mdn) {
        this.mdn = mdn;
    }

    // Getters and setters


    public String getMdn() {
        return mdn;
    }


    public String getProduct() {
        return product;
    }
    
    public String getVoice() {
        return voice;
    }


    public String getSms() {
        return sms;
    }



}
