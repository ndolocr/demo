package com.example.demo.school;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    public List<School> getAllSchools(){
        return List.of(
                new School(
                        1L,
                        "Alliance High School",
                        "AHS",
                        "info@ahs.com",
                        "P.O. Box 07 – 00902",
                        "Kikuyu, Kenya"
                )
        );
    }
}
