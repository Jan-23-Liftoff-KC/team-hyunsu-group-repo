package org.launchcode.healthehub.models;

// created by kp on 2/27/2023

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Note {

    @Id
    @GeneratedValue
    private int id;

    private String date;

    private String contents;

    public Note(){}

    public Note(String contents) {
        this.contents = contents;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}