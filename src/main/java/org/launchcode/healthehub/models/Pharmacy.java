package org.launchcode.healthehub.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Pharmacy {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String phone;

    @NotNull
    private String fax;
    
    @NotNull
    private String address;
    
    private String notes;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    public Pharmacy() {
    }

    public Pharmacy(String name, String phone, String fax, String address, String notes, User user) {
        this.name = name;
        this.phone = phone;
        this.fax = fax;
        this.address = address;
        this.notes = notes;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
