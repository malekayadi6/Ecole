package com.schoolmanager.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.*;

/**
 * Created by Mahdi on 3/26/2016.
 */
@Entity(name = "ParentNew1")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ParentId;

    @NotEmpty(message = "Please enter your name.")
    private String ParentName;

    @NotEmpty(message = "Please enter your email.")
    @Email(message = "not a valid email address.")
    private String ParentEmail;


    private int ParentPhoneNumber;

    @NotEmpty(message = "Please enter your Profession.")
    private String ParentProfession;

    @NotEmpty(message = "Please enter your Address.")
    private String ParentAddress;

    @NotEmpty(message = "Please enter a Password.")
    private String ParentPassword;



    @OneToMany(fetch = FetchType.LAZY,mappedBy="parentStudent")
    private Collection<Student> students= new LinkedHashSet<Student>();


    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }

    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String parentName) {
        ParentName = parentName;
    }

    public String getParentEmail() {
        return ParentEmail;
    }

    public void setParentEmail(String parentEmail) {
        ParentEmail = parentEmail;
    }

    public int getParentPhoneNumber() {
        return ParentPhoneNumber;
    }

    public void setParentPhoneNumber(int parentPhoneNumber) {
        ParentPhoneNumber = parentPhoneNumber;
    }

    public String getParentProfession() {
        return ParentProfession;
    }

    public void setParentProfession(String parentProfession) {
        ParentProfession = parentProfession;
    }

    public int getParentId() {
        return ParentId;
    }

    public void setParentId(int parentId) {
        ParentId = parentId;
    }

    public String getParentAddress() {
        return ParentAddress;
    }

    public void setParentAddress(String parentAddress) {
        ParentAddress = parentAddress;
    }

    public String getParentPassword() {
        return ParentPassword;
    }

    public void setParentPassword(String parentPassword) {
        ParentPassword = parentPassword;
    }
}
