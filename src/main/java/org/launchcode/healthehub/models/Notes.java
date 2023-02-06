package org.launchcode.healthehub.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Notes {
    @Id
    @GeneratedValue
    private int id;
    
    @DateTimeFormat(pattern = "MM/DD/YYYY hh:mm a")
    private Date date;
    @NotNull
    @Size(max=1000)
    private String contents;
    
    public int getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate() {
        this.date = new Date();
    }
    
    public String getContents() {
        return contents;
    }
        public void setContents(String contents) {
        this.contents = contents;
    }
}
