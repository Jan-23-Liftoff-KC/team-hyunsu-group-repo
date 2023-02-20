package org.launchcode.healthehub.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private int id;
    
    @NotNull
    private String firstName;
    
    @NotNull
    private String lastName;
    
    @NotNull
    @DateTimeFormat(pattern = "MM/DD/YYYY")
    private Date dob;
    
    @NotNull
    @Email
    private String email;
    
    @NotNull
    private String password;
    
    @NotNull
    private String verifyPassword;
    
    @NotNull
    private String phone;
    
    @NotNull
    private  String address;
    
    @OneToMany
    private List<Notes> notes;
    
    @OneToMany
    private List<Immunization> immunizations;

    @OneToMany
    private List<Allergy> allergies;

    @OneToMany
    private List<Hospitalization> hospitalizations;

    @OneToMany
    private List<Medication> medications;

    @OneToMany
    private List<Pharmacy> pharmacies;

    @OneToMany
    private List<Notes> providers;
}
