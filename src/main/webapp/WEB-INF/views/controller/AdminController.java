package com.schoolmanager.controller;


import com.schoolmanager.dao.ParentDao;
import com.schoolmanager.dao.StudentDao;
import com.schoolmanager.model.Parent;
import com.schoolmanager.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahdi on 3/25/2016.
 */
@Controller
public class AdminController {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private ParentDao parentDao;



    @RequestMapping("/admin/student")
    public String studentAdmin(Model model){
        List<Student> students =studentDao.getAllStudents();
        model.addAttribute("students",students);
        System.out.print("+++++++++++++++"+students.get(0).getParentStudent().getParentId()+"+++++++++++++++\n");
        return "studentAdmin";
    }

    @RequestMapping("/admin/student/add")
    public String studentAdd(Model model){
        List<Parent> parents =new ArrayList<Parent>();

        parents=parentDao.getAllParents();

        Student student =new Student();

        model.addAttribute("student",student);
        model.addAttribute("parents",parents);
        return "studentAdd";
    }


    @RequestMapping(value = "/admin/student/add", method = RequestMethod.POST)
    public String studentAddPost(@Valid @ModelAttribute("student") Student student, BindingResult result){

        if (result.hasErrors()) {

            return "studentAdd";
        }
        Parent parent =parentDao.getParentById(student.getParentStudent().getParentId());
        student.setParentStudent(parent);

        //parent.getStudents().add(student);

        studentDao.addStudent(student);

        return "redirect:/admin/student/";
    }


    @RequestMapping(value ="/admin/student/edit/{id}")
    public String studentEdit(@PathVariable("id") String id, Model model)
    {
        int idInt=Integer.parseInt(id);
        Student student = studentDao.getStudentById(idInt);
        model.addAttribute(student);

        List<Parent> parents =new ArrayList<Parent>();
        parents = parentDao.getAllParents();
        model.addAttribute("parents",parents);



        return "studentEdit";
    }

    @RequestMapping(value ="/admin/student/edit/{id}",method = RequestMethod.POST)
    public String studentEditPost(@Valid @ModelAttribute("student") Student student, BindingResult result){

        if (result.hasErrors()) {
            return "studentEdit";
        }

        studentDao.addStudent(student);

        return "redirect:/admin/student/";
    }

    @RequestMapping(value ="/admin/student/delete/{id}")
    public String deleteStudent(@PathVariable("id") String id, Model model)
    {
        int idInt=Integer.parseInt(id);
        studentDao.deleteStudent(idInt);

        return "redirect:/admin/student/";
    }













    @RequestMapping("/admin/parent")
    public String ParentAdmin(Model model){
       List<Parent> parents =parentDao.getAllParents();
       model.addAttribute("parents",parents);
        return "parentAdmin";
    }

    @RequestMapping(value = "/admin/parent/add", method = RequestMethod.GET)
    public String parentAdd(Model model){
        Parent parent=new Parent();
        model.addAttribute("parent",parent);
        return "parentAdd";
    }

    @RequestMapping(value = "/admin/parent/add", method = RequestMethod.POST)
    public String parentAddPost(@Valid @ModelAttribute("parent") Parent parent, BindingResult result){

        if (result.hasErrors()) {
            return "parentAdd";
        }

        parentDao.addParent(parent);

        return "redirect:/admin/parent/";
    }

    @RequestMapping(value ="/admin/parent/edit/{id}")
    public String parentEdit(@PathVariable("id") String id, Model model)
    {
        int idInt=Integer.parseInt(id);
        Parent parent = parentDao.getParentById(idInt);

        model.addAttribute(parent);

        return "parentEdit";
    }

    @RequestMapping(value ="/admin/parent/edit/{id}",method = RequestMethod.POST)
    public String parentEditPost(@Valid @ModelAttribute("parent") Parent parent, BindingResult result){

        if (result.hasErrors()) {
            return "parentEdit";
        }

        parentDao.addParent(parent);

        return "redirect:/admin/parent/";
    }





    @RequestMapping(value ="/admin/parent/delete/{id}")
    public String deleteParent(@PathVariable("id") String id, Model model)
    {
        int idInt=Integer.parseInt(id);
        parentDao.deleteParent(idInt);

        return "redirect:/admin/parent/";
    }


    @RequestMapping("/admin/class")
    public String classAdmin(Model model){
        List<Parent> parents =parentDao.getAllParents();
        model.addAttribute("parents",parents);
        return "parentAdmin";
    }



}
