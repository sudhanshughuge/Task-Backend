package com.task.TaskBackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private int UserID;
    private String Name;

    @Column(unique = true, nullable = false)
    private String username;
    private String Password;

    @Column(unique = true, nullable = false)
    private String Email;

    public User() {
    }

    public User(int userID, String name, String username, String password, String email) {
        UserID = userID;
        Name = name;
        this.username = username;
        Password = password;
        Email = email;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
