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
                        40,
                        "Raphael Ndolo",
                        "ndoloraphael@gmail.com",
                        LocalDate.of(1984, Month.AUGUST, 8)
                )
        );
    }
}
