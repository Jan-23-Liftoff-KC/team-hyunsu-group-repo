package org.launchcode.healthehub.models;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Notes {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String date;
    @NotNull
    @Size(max=1000)
    private String contents;

    public Notes(){};

    public Notes(String date, String contents) {
        this.date = date;
        this.contents = contents;
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
