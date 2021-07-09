package com.ngenx.test.user.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public long id;
    @Column(name= "firstname")
    public String FirstName;
    @Column(name= "lastname")
    public String LastName;
    @Column(name= "email")
    @NotNull
    public String Email;
    @Column(name= "status")
    public String status;
    @Column(name= "password")
    public String Password;
    @Column(name= "passwordexpiry")
    public Date PasswordExpiry;
    @Column(name= "branchid")
    public int BranchId;
    @Column(name= "roleid")
    public int RoleId;
    @Column(name= "departmentid")
    public int DepartmentId;
    @Column(name= "createdby")
    public int CreatedBy;
    @Column(name= "createdon")
    public Date CreatedOn;
    @Column(name= "modifiedon")
    public Date ModifiedOn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getPasswordExpiry() {
        return PasswordExpiry;
    }

    public void setPasswordExpiry(Date passwordExpiry) {
        PasswordExpiry = passwordExpiry;
    }

    public int getBranchId() {
        return BranchId;
    }

    public void setBranchId(int branchId) {
        BranchId = branchId;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }

    public int getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(int departmentId) {
        DepartmentId = departmentId;
    }

    public int getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(int createdBy) {
        CreatedBy = createdBy;
    }

    public Date getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(Date createdOn) {
        CreatedOn = createdOn;
    }

    public Date getModifiedOn() {
        return ModifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        ModifiedOn = modifiedOn;
    }
}
