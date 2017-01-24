package com.schoolmanager.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by Mahdi on 3/30/2016.
 */
public class Class {

    private int classId;
    private String className;

    @ManyToOne
    @JoinColumn(name="TeacherClassId")
    private Teacher teacher;
}
