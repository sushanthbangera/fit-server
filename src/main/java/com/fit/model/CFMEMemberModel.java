
package com.fit.model;

import com.fit.dto.CFMEMemberDTO;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author Sushanth Bangera
 */
@Entity
@Table(name = "tblMember")
public class CFMEMemberModel implements Serializable {
    
    @Id
    @Column(name = "fldId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "fldFirstName")
    private String firstName;
    
    @Column(name = "fldLastName")
    private String lastName;
    
    @Column(name = "fldAge")
    private int age;
    
    @Column(name = "fldContact")
    private String contact;
    
    @Column(name = "fldEmail")
    private String email;
    
    @Column(name = "fldDateOfBirth")
    private LocalDate dateOfBirth;
    
    @Column(name = "fldAddress")
    private String address;
    
    @Column(name = "fldCreatedDate")
    private LocalDateTime createdDate;
    
    @Column(name = "fldUpdatedDate")
    @UpdateTimestamp
    private LocalDateTime updatedDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}
