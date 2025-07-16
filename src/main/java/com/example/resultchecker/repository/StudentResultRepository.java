package com.example.resultchecker.repository;

import com.example.resultchecker.model.StudentResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentResultRepository extends JpaRepository<StudentResult, Long> {
    // Find by Roll No.
    StudentResult findByRollNo(Long rollNo);
}

