package com.springboot.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {
    private String name;
    private String email;
    private String schoolNum;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setSchoolNum(String schoolNum) {
        this.schoolNum = schoolNum;
    }

    public String getSchoolNum() {
        return schoolNum;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
