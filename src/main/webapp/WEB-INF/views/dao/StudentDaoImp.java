package com.schoolmanager.dao;

import com.schoolmanager.model.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Mahdi on 3/26/2016.
 */

@Repository
@Transactional
public class StudentDaoImp implements StudentDao{

    @Autowired
    private SessionFactory sessionFactory;

    public void addStudent(Student student) {
        Session session =sessionFactory.getCurrentSession();
        session.saveOrUpdate(student);
        session.flush();

    }

    public Student getStudentById(int id) {
        Session session =sessionFactory.getCurrentSession();
        Student student = (Student) session.get(Student.class,id);
        session.flush();
        return student;
    }

    public List<Student> getAllStudents() {
        Session session =sessionFactory.getCurrentSession();
        Query query=session.createQuery("from StudentNew1");
        List<Student> students=query.list();
        session.flush();
        return students;
    }

    public void deleteStudent(int id) {
        Session session =sessionFactory.getCurrentSession();
        session.delete(getStudentById(id));
        session.flush();
    }
}
