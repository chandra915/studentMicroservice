package com.example.Test.controller;
import com.example.Test.entity.Student;
import com.example.Test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//@RequestMapping(value = "")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student saveStudent(@RequestBody  Student student){
            return studentService.saveStudent(student);
    }
    @GetMapping("/students")
    public List<Student> fetchStuents(){
        return studentService.fetchStuents();
    }
    @GetMapping("/students/{id}")
    public Student fetchStudentById(@PathVariable("id") Long studentId)
    {
        return  studentService.fetchStudentById(studentId);
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId)
    {
        return  studentService.deleteStudentById(studentId);
    }
    @PutMapping("/students/{id}")
    public Student updateStudentById(@PathVariable("id") Long studentId,@RequestBody Student student)
    {
        return  studentService.updateStudentById(studentId,student);
    }
    @GetMapping("/students/branch/{branch}")
    public List<Student> fetchStudnetByBranch(@PathVariable("branch") String branch)
    {
        return  studentService.fetchStudnetByBranch(branch);
    }



}
