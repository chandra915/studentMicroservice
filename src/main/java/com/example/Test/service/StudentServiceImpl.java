package com.example.Test.service;


import com.example.Test.entity.Student;
import com.example.Test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return  studentRepository.save(student);
    }

    @Override
    public List<Student> fetchStuents() {
        return studentRepository.findAll();
    }

    @Override
    public Student fetchStudentById(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public String deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
        return  "Student Deleted";
    }

    @Override
    public Student updateStudentById(Long studentId,Student student) {

        Student tmp=studentRepository.findById(studentId).get();
        //  null == "zyx"                             ""== "zyx"
        //     true                          &&              true
        if(Objects.nonNull(student.getStudentName()) && !"".equals(student.getStudentName()))
        {
            tmp.setStudentName(student.getStudentName());
        }
        if(Objects.nonNull(student.getStudentLastName()) && !"".equals(student.getStudentLastName()))
        {
            tmp.setStudentLastName(student.getStudentLastName());
        }
        if(Objects.nonNull(student.getBranch()) && !"".equals(student.getBranch()))
        {
            tmp.setBranch(student.getBranch());
        }
        if(Objects.nonNull(student.getEmail()) && !"".equals(student.getEmail()))
        {
            tmp.setEmail(student.getEmail());
        }
        if(Objects.nonNull(student.getLocation()) && !"".equals(student.getLocation()))
        {
            tmp.setLocation(student.getLocation());
        }
        return studentRepository.save(tmp);
    }

    @Override
    public List<Student> fetchStudnetByBranch(String branch) {
        return studentRepository.findByBranch(branch);
    }
}
