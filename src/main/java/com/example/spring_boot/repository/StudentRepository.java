package com.example.spring_boot.repository;

import com.example.spring_boot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select s from Student s where s.group.id = :groupId")
    List<Student> findAllStudentByGroupId(Long groupId);
}