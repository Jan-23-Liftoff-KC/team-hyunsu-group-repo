package org.launchcode.healthehub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Immunization {
    @Id
    @GeneratedValue
    public int id;
    private String Name;
    private String Date;
    private String Dosage;
    private String Notes;

    public Immunization(String name, String date, String dosage, String notes) {
        this.Name = name;
        this.Date = date;
        this.Dosage = dosage;
        this.Notes = notes;
    }
    public Immunization(){

    }

    public int getId() {
        return id;
    }

    <-- There shouldn't be a setter method for the id. -->

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}

