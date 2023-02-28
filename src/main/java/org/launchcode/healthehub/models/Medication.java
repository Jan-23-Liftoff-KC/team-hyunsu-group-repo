package org.launchcode.healthehub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medication {

    @Id
    @GeneratedValue
    private int id;

    private String rxMed;
    private String otcMed;
    private String provider;
    private String useReason;
    private String notes;

    public Medication(){};

    public Medication(String rxMed, String otcMed, String provider, String useReason, String notes) {
        this.rxMed = rxMed;
        this.otcMed = otcMed;
        this.provider = provider;
        this.useReason = useReason;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public String getRxMed() {
        return rxMed;
    }

    public void setRxMed(String rxMed) {
        this.rxMed = rxMed;
    }

    public String getOtcMed() {
        return otcMed;
    }

    public void setOtcMed(String otcMed) {
        this.otcMed = otcMed;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getUseReason() {
        return useReason;
    }

    public void setUseReason(String useReason) {
        this.useReason = useReason;
    }

    public String getNotes() {return notes;}

    public void setNotes(String notes) {
        this.notes = notes;
    }
}