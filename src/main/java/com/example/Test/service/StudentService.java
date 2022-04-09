package com.example.Test.service;

import com.example.Test.entity.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> fetchStuents();

    public Student fetchStudentById(Long studentId);

    public String deleteStudentById(Long studentId);

    public  Student updateStudentById(Long studentId,Student student);

    public  List<Student> fetchStudnetByBranch(String branch);
}
