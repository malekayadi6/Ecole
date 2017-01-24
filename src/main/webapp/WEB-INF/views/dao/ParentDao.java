package com.schoolmanager.dao;

import com.schoolmanager.model.Parent;

import java.util.List;

/**
 * Created by Mahdi on 3/26/2016.
 */
public interface ParentDao {
    void addParent (Parent parent);
    Parent getParentById(int id);
    List<Parent> getAllParents();
    void deleteParent(int id);
}
