package com.schoolmanager.dao;

import com.schoolmanager.model.Parent;
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
public class ParentDaoImp implements ParentDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addParent(Parent parent) {
        Session session =sessionFactory.getCurrentSession();
        session.saveOrUpdate(parent);
        session.flush();
    }

    public Parent getParentById(int id) {
        Session session =sessionFactory.getCurrentSession();
        Parent parent = (Parent) session.get(Parent.class,id);
        session.flush();
        return parent;
    }

    public List<Parent> getAllParents() {
        Session session =sessionFactory.getCurrentSession();
        Query query=session.createQuery("from ParentNew1");
        List<Parent> parents=query.list();
        session.flush();
        return parents;
    }

    public void deleteParent(int id) {
        Session session =sessionFactory.getCurrentSession();
        session.delete(getParentById(id));
        session.flush();
    }

}
