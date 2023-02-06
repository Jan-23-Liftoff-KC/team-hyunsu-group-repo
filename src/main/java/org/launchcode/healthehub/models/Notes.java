package org.launchcode.healthehub.models;

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
    @Size(max=1000)
    private String contents;
    
    public int getId() {
        return id;
    }
        public String getContents() {
        return contents;
    }
        public void setContents(String contents) {
        this.contents = contents;
    }
}
