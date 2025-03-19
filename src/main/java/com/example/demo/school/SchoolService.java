package com.example.demo.school;


import java.util.List;


public class SchoolService {
    public List<School> getAllSchools(){
        return List.of(
                1L,
                "Alliance High School",
                "AHS",
                "info@ahs.com",
                "P.O. Box 07 – 00902",
                "Kikuyu, Kenya"
        );
    }
}
