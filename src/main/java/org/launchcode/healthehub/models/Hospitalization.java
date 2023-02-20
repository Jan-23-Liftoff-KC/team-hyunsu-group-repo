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
public class Hospitalization {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int id;

    @NotNull
    private String reason;

    @NotNull
    private String facility;

    @NotNull
    private String provider;

    @NotNull
    private String treatment;

    @NotNull
    @DateTimeFormat(pattern = "MM/DD/YYYY")
    private Date dateOfAdmission;

    @NotNull
    @DateTimeFormat(pattern = "MM/DD/YYYY")
    private Date dateOfDischarge;
}
