package com.berkaybarisalgun.Pagination.Example.controller;

import com.berkaybarisalgun.Pagination.Example.model.Student;
import com.berkaybarisalgun.Pagination.Example.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping("/students")
    public Page<Student> getItems(@RequestParam(name = "page", defaultValue = "0") int page,
                                  @RequestParam(name = "size", defaultValue = "3") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return service.getAllStudents(pageable);
    }
}
