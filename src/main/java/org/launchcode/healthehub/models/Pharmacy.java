package org.launchcode.healthehub.models;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Pharmacy {
    @Id
    @GeneratedValue
    public int id;

    @NotNull
    public String facilityName;

    @NotNull
    public String pharmPhone;

    @NotNull
    public String fax;

    public Pharmacy() {
    }

    public Pharmacy(int id, String facilityName, String pharmPhone, String fax) {
        this.id = id;
        this.facilityName = facilityName;
        this.pharmPhone = pharmPhone;
        this.fax = fax;
    }

    public int getId() {
        return id;
    }


    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getPharmPhone() {
        return pharmPhone;
    }

    public void setPharmPhone(String pharmPhone) {
        this.pharmPhone = pharmPhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
