package com.berkaybarisalgun.Pagination.Example.repository;

import com.berkaybarisalgun.Pagination.Example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
