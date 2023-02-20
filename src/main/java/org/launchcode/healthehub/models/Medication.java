package org.launchcode.healthehub.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Medication {

    @Id
    @GeneratedValue
    private int id;


    private String rxMed;


    private String otcMed;


    private String provider;


    private String useReason;

    public Medication(){
    }

    public int getId() {
        return id;
    }

    public Medication(int id, String rxMed, String otcMed, String provider, String useReason) {
        this.id = id;
        this.rxMed = rxMed;
        this.otcMed = otcMed;
        this.provider = provider;
        this.useReason = useReason;
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
}
