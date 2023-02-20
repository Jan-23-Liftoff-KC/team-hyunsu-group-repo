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

    private String medAllergy;

    private String othAllergy;

    private String rxnComment;

    public Allergy(){
    }

    public int getId() {
        return id;
    }

    public Allergy(int id, String medAllergy, String othAllergy, String rxnComment) {
        this.id = id;
        this.medAllergy = medAllergy;
        this.othAllergy = othAllergy;
        this.rxnComment = rxnComment;
    }

    public String getMedAllergy() {
        return medAllergy;
    }

    public void setMedAllergy(String medAllergy) {
        this.medAllergy = medAllergy;
    }

    public String getothAllergy() {
        return othAllergy;
    }

    public void setothAllergy(String othAllergy) {
        this.othAllergy = othAllergy;
    }

    public String getrxnComment() {
        return rxnComment;
    }

    public void setrxnComment(String rxnComment) {
        this.rxnComment = rxnComment;
    }
}
