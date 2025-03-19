package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private Integer age;
    private String name;
    private String email;
    private LocalDate dob;

    public Student(){

    }

    public Student(Long id, Integer age, String name, String email, LocalDate dob){
        this.id = id;
        this.age = age;
        this.dob = dob;
        this.name = name;
        this.email = email;
    }

    public Student(Integer age, String name, String email, LocalDate dob){
        this.age = age;
        this.dob = dob;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
