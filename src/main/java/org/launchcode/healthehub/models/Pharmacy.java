package org.launchcode.healthehub.models;

import lombok.*;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Pharmacy {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String phone;

    @NotNull
    private String fax;
    
    @NotNull
    private String address;
    
    private String notes;
}
