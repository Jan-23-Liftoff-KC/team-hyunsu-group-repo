package org.launchcode.healthehub.models;

import javax.persistence.*;


@Entity
public class Allergy {

    @Id
    @GeneratedValue
    private int id;

    private String medAllergy;

    private String othAllergy;

    private String rxnComment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Allergy(){};

    public Allergy(String medAllergy, String othAllergy, String rxnComment, User user) {
        this.medAllergy = medAllergy;
        this.othAllergy = othAllergy;
        this.rxnComment = rxnComment;
        this.user = user;
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
