package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
//        return List.of(
//                new Student(
//                        1L,
//                        "ndoloraphael@gmail.com",
//                        LocalDate.of(1984, Month.AUGUST, 8),
//                        "Male",
//                        "Raphael",
//                        "Charles",
//                        "7577",
//                        LocalDate.of(2000, Month.JANUARY, 8)
//                )
//        );
    }
}