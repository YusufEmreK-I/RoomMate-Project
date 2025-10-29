package com.konuk.yusuf.roommate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "roommate", name = "user")
public class User {

    String uuid;
    String firstName;
    String lastName;
    String email;
    String password;

    public User() {
    }

    public User(String password, String email, String lastName, String firstName, String uuid) {
        this.password = password;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.uuid = uuid;
    }

    @Id
    @Column(name = "uuid", unique = true, nullable = false, length = 36)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Column(name = "first_name", unique = true, nullable = false, length = 100)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", unique = true, nullable = false, length = 100)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email", unique = true, nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", unique = true, nullable = false, length = 64)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
