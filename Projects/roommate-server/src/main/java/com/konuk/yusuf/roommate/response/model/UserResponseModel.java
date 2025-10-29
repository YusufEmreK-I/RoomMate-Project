package com.konuk.yusuf.roommate.response.model;

import com.konuk.yusuf.roommate.model.User;

public class UserResponseModel {
    String uuid;
    String firstName;
    String lastName;
    String email;

    public UserResponseModel(User user) {
        this.uuid = user.getUuid();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
