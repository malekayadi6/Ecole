package com.schoolmanager.dao;

import com.schoolmanager.model.Student;

import java.util.List;

/**
 * Created by Mahdi on 3/26/2016.
 */

public interface StudentDao {

    void addStudent (Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
    void deleteStudent(int id);


}
