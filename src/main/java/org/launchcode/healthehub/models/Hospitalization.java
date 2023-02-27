package org.launchcode.healthehub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Hospitalization {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String reason;

    @NotNull
    private String facility;

    @NotNull
    private String provider;

    @NotNull
    private String treatment;

    @NotNull
    private String dateOfAdmission;

    @NotNull
    private String dateOfDischarge;

    private String notes;

    public Hospitalization(){};

    public Hospitalization(String reason, String facility, String provider, String treatment, String dateOfAdmission, String dateOfDischarge, String notes) {
        this.reason = reason;
        this.facility = facility;
        this.provider = provider;
        this.treatment = treatment;
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfDischarge = dateOfDischarge;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(String dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
