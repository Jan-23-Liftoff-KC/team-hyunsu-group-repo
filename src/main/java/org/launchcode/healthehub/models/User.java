package org.launchcode.healthehub.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue
    private int id;
    
    @NotNull
    private String firstName;
    
    @NotNull
    private String lastName;
    
    @NotNull
    private String dob;
    
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

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isAccountNonExpired;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isAccountNonLocked;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isCredentialsNonExpired;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isEnabled;
    
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
    private List<Provider> providers;

    public User() {
    }

    public User(String firstName, String lastName,
                String dob,
                String email, String password,
                String phone, String address,
                boolean isAccountNonExpired, boolean isAccountNonLocked,
                boolean isCredentialsNonExpired, boolean isEnabled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
