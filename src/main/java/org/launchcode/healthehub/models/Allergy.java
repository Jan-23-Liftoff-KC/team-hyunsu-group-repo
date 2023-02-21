package org.launchcode.healthehub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Allergy {

    @Id
    @GeneratedValue
    private int id;

    private String medAllergy;

    private String othAllergy;

    private String rxnComment;

    public Allergy(){};

    public Allergy(String medAllergy, String othAllergy, String rxnComment) {
        this.medAllergy = medAllergy;
        this.othAllergy = othAllergy;
        this.rxnComment = rxnComment;
    }

    public int getId() {
        return id;
    }

    public String getMedAllergy() {
        return medAllergy;
    }

    public void setMedAllergy(String medAllergy) {
        this.medAllergy = medAllergy;
    }

    public String getOthAllergy() {
        return othAllergy;
    }

    public void setOthAllergy(String othAllergy) {
        this.othAllergy = othAllergy;
    }

    public String getRxnComment() {
        return rxnComment;
    }

    public void setRxnComment(String rxnComment) {
        this.rxnComment = rxnComment;
    }
}
