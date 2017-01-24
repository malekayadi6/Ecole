package com.schoolmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 * Created by Mahdi on 3/25/2016.
 */

@Entity(name = "StudentNew1")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String StudentName;
    private String StudentSex;
    private String StudentBirthday;

    private String StudentClass;

    @ManyToOne
    @JoinColumn(name = "StudentParentId" )
    private Parent parentStudent;


    public Parent getParentStudent() {
        return parentStudent;
    }

    public void setParentStudent(Parent parentStudent) {
        this.parentStudent = parentStudent;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentSex() {
        return StudentSex;
    }

    public void setStudentSex(String studentSex) {
        StudentSex = studentSex;
    }





    public String getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(String studentClass) {
        StudentClass = studentClass;
    }


    public String getStudentBirthday() {
        return StudentBirthday;
    }

    public void setStudentBirthday(String studentBirthday) {
        StudentBirthday = studentBirthday;
    }
}
