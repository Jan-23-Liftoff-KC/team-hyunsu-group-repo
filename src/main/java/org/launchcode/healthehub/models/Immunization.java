package org.launchcode.healthehub.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Immunization {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    public int id;
    
    @NotNull
    private String name;
    
    @NotNull
    @DateTimeFormat(pattern = "MM/DD/YYYY")
    private Date date;
    private String dosage;
    private String notes;
}

