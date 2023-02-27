package org.launchcode.healthehub.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Immunization {

    @Id
    @GeneratedValue
    public int id;
    
    @NotNull
    private String name;
    
    @NotNull
    private String date;

    private String dosage;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;



    public Immunization(){
    };

    public Immunization(String name, String date, String dosage, String notes, User user) {
        this.name = name;
        this.date = date;
        this.dosage = dosage;
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
    
  public String getDate() {
        return date;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
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

