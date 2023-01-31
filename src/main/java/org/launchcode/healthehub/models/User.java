package org.launchcode.healthehub.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
@Table(name = "user_name")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotEmpty(message = "Email cannot be empty")
    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @NotEmpty(message = "Password field cannot be empty")
    @Column(nullable = false, length = 64)
    private String password;

    @NotEmpty(message = "First name cannot be empty")
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @NotEmpty(message = "Last name cannot be empty")
    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    @NotEmpty(message = "Address field cannot be empty")
    @Column(nullable = false, unique = true, length = 75)
    private String address;

    @NotEmpty(message = "DOB field cannot be empty")
    @Column(nullable = false, unique = false, length = 25)
    private Integer dateOfBirth;
    @NotEmpty(message = "Phone number field cannot be empty")
    @Column(nullable = false, unique = false, length = 25)
    private Integer phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(address, user.address) && Objects.equals(dateOfBirth, user.dateOfBirth) && Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, firstName, lastName, address, dateOfBirth, phoneNumber);
    }
}
