package org.launchcode.healthehub.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Note {

    @Id
    @GeneratedValue
    private int noteId;

    @NotNull
    private String date;

    @NotNull
    @Size(max=1000)
    private String contents;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    public Note(){};

    public Note(String date, String contents, User user) {
        this.date = date;
        this.contents = contents;
        this.user = user;
    }

    public int getNoteId() {
        return noteId;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
