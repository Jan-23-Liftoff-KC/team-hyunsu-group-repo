package org.launchcode.healthehub.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Hospitalization {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
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

    private String notes;

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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
