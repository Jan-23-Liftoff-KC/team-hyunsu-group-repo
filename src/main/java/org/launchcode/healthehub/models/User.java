package org.launchcode.healthehub.models;

import org.launchcode.healthehub.security.auth.Role;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
public class User {
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

    private String username;
    
    @NotNull
    private String password;
    
    @NotNull
    private String verifyPassword;
    
    @NotNull
    private String phone;
    
    @NotNull
    private  String address;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isAccountNonExpired = true;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isAccountNonLocked = true;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isCredentialsNonExpired = true;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isEnabled = true;

    @ManyToMany(cascade = CascadeType.MERGE)
    private Set<Role> roles;

    @OneToMany
    private List<Allergy> allergies;

    @OneToMany
    private List<Hospitalization> hospitalizations;

    @OneToMany
    private List<Immunization> immunizations;

    @OneToMany
    private List<Medication> medications;

    @OneToMany
    private List<NoteBROKEN> notes;

    @OneToMany
    private List<Pharmacy> pharmacies;

    @OneToMany
    private List<Provider> providers;

    public User() {
    }

    public User(String firstName, String lastName, String dob, String email, String username, String password, String phone, String address,
                boolean isAccountNonExpired, boolean isAccountNonLocked, boolean isCredentialsNonExpired, boolean isEnabled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.username = username;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.isAccountNonExpired = accountNonExpired;
    }

    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        isAccountNonLocked = accountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        isCredentialsNonExpired = credentialsNonExpired;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
