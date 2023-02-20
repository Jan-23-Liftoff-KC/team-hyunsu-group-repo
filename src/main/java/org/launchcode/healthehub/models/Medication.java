package org.launchcode.healthehub.models;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Medication {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int id;

    private String rxMed;
    private String otcMed;
    private String provider;
    private String useReason;
}