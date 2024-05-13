package com.springboot.project.studentmanagementsystem.controller;

import com.springboot.project.studentmanagementsystem.entity.Student;
import com.springboot.project.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;
    public StudentController(StudentService theStudentService)
    {
        this.studentService=theStudentService;
    }

    @GetMapping("/list")
    public String listStudents(Model theModel)
    {
        List<Student> students= studentService.findAll();
        theModel.addAttribute("students",students);
        return "students/list-students";
    }

    @GetMapping("/showFormForAdd")
    public String AddStudents(Model theModel)
    {
        Student theStudent=new Student();
        theModel.addAttribute("student", theStudent);
        return "students/student-form";
    }
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student theStudent)
    {
        studentService.saveStudent(theStudent);
        return "redirect:/students/list";
    }
    @GetMapping("/showFormForUpdate")
    public String updateStudent(@RequestParam("studentId") int studentId,Model theModel)
    {
       Student theStudent= studentService.findStudentById(studentId);
       theModel.addAttribute("student",theStudent);
       return "students/student-form";
    }
    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("studentId") int studentId,Model theModel)
    {
        studentService.deleteByStudentId(studentId);
        return "redirect:/students/list";
    }

}
