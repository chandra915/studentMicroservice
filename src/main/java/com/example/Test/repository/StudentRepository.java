package com.example.Test.repository;

import com.example.Test.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public  List<Student> findByBranch(String branch);
}
