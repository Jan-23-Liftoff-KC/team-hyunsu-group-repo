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
public class Allergy {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int id;

    private String medAllergy;

    private String othAllergy;

    private String rxnComment;
}
