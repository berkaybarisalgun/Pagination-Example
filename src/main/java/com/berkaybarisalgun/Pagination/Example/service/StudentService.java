package com.berkaybarisalgun.Pagination.Example.service;

import com.berkaybarisalgun.Pagination.Example.model.Student;
import com.berkaybarisalgun.Pagination.Example.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public Page<Student> getAllStudents(Pageable pageable){
        return repository.findAll(pageable);
    }
}
