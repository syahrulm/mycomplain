package com.complain.my.subscription.user;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by dikatok64633 on 2/25/2016.
 */
@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID userGUID;

    private String username;

    private String password;

    public UUID getUserGUID() {
        return userGUID;
    }

    public void setUserGUID(UUID userGUID) {
        this.userGUID = userGUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
