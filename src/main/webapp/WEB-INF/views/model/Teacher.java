package com.schoolmanager.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Mahdi on 3/30/2016.
 */
public class Teacher {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;

    private String teacherName;
    private String teacherSex;
    private String teacherBirthday;

    @OneToMany(mappedBy="teacher")
    private List<Class> teacherClasses;



}
