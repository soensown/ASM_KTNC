package com.example.asm_KTNC_1.service;


public class GetName {
    private String name;

    public GetName(String name) {
        this.name = name;
    }

    public String getNameObject() {
        if (this.name == null) {
            throw new NullPointerException("tên trống");
        }
        return this.name;
    }

    public static String getNameFromProfile(GetName profile) {
        if (profile == null) {
            throw new NullPointerException("Profile trống");
        }
        return profile.getNameObject();
    }

}
