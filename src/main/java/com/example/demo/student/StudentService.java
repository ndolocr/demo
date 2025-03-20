package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAllStudents(){
        return List.of(
                new Student(
                        1L,
                        "ndoloraphael@gmail.com",
                        LocalDate.of(1984, Month.AUGUST, 8),
                        "Male",
                        "Raphael",
                        "Charles",
                        "7577",
                        LocalDate.of(2000, Month.JANUARY, 8)
                )
        );
    }
}