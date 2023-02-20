package org.launchcode.healthehub.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Allergy {

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
    @DateTimeFormat(pattern = "MM/DD/YYYY")
    private Date dateOfAdmission;

    @NotNull
    @DateTimeFormat(pattern = "MM/DD/YYYY")
    private Date dateOfDischarge;


        public Allergy(){}

    public int getId() {
        return id;
    }

    public Allergy(int id, String reason, String facility, String provider, String treatment, Date dateOfAdmission, Date dateOfDischarge) {
        this.id = id;
        this.reason = reason;
        this.facility = facility;
        this.provider = provider;
        this.treatment = treatment;
        this.dateOfAdmission = dateOfAdmission;
        this.dateOfDischarge = dateOfDischarge;
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

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public Date getDateOfDischarge() {
        return dateOfDischarge;
    }

    public void setDateOfDischarge(Date dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }
}
