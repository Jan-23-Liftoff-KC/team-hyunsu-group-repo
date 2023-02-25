package org.launchcode.healthehub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Provider {


    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String address;

    @NotNull
    private String phone;
    @NotNull
    private String fax;

    @NotNull
    private String specialty;

    @NotNull
    private String website;

    @NotNull
    private String dateStartedCare;


    private String notes;

    public Provider() {
    }

    public Provider(String firstName, String lastName, String address, String phone, String fax, String specialty, String website, String dateStartedCare, String notes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
        this.specialty = specialty;
        this.website = website;
        this.dateStartedCare = dateStartedCare;
        this.notes = notes;
    }

    public int getId() {
        return id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDateStartedCare() {
        return dateStartedCare;
    }

    public void setDateStartedCare(String dateStartedCare) {
        this.dateStartedCare = dateStartedCare;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
