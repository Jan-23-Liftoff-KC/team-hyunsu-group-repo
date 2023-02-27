package org.launchcode.healthehub.security.auth;

// created by kp on 2/27/2023

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private int roleId;

    private String role;

    public Role(){};

    public Role(String role) {
        this.role = role;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
