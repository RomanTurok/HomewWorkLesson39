package com.example.HomewWorkLesson39.rest;

import com.example.HomewWorkLesson39.domain.Student;
import com.example.HomewWorkLesson39.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping("/allStudents")
    public List<Student> findAll(){
        return studentService.findAll();
    }
    @GetMapping("/allStudents/{id}")
    public Optional<Student> findById(@PathVariable int id){
        return studentService.findById(id);
    }

}
