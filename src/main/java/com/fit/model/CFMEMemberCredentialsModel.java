
package com.fit.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Sushanth Bangera
 */

@Entity
@Table(name = "tblMemberCredentials")
public class CFMEMemberCredentialsModel implements Serializable {
 
    @Id
    @Column(name = "fldId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "fldMember")
    private CFMEMemberModel member;
    
    @Column(name = "fldUserName")
    private String username;

    @Column(name = "fldPassword")
    private String password;

    @Column(name = "fldCreatedDate")
    private Date createdDate;

    @Column(name = "fldDeleted")
    private boolean isDeleted;

    @Column(name = "fldUpdatedDate")
    private Date updatedDate;
    
}
