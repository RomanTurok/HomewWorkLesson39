package com.example.HomewWorkLesson39.service;

import com.example.HomewWorkLesson39.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    public List<Student> findAll(){
        return List.of(
                new Student("Ivan", "Bereza", 1, 03),
                new Student("Taras", "Kub", 2, 03),
                new Student("Pavlo", "Zelen", 3, 03));
    }

    public Optional<Student> findById(long id){
        return Optional.of(
                new Student("Ira", "Mokra", 4, 01));
    }

}
