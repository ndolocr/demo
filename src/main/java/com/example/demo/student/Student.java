package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String email;
    private LocalDate dob;
    private String gender;
    private String lastName;
    private String firstName;
    private String admissionNumber;
    private LocalDate admissionDate;

    // Constructors
    public Student() {}

    public Student(String email, LocalDate dob, String gender, String lastName, String firstName, String admissionNumber, LocalDate admissionDate) {
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.lastName = lastName;
        this.firstName = firstName;
        this.admissionNumber = admissionNumber;
        this.admissionDate = admissionDate;
    }

    public Student(Long id, String email, LocalDate dob, String gender, String lastName, String firstName, String admissionNumber, LocalDate admissionDate) {
        this.id = id;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.lastName = lastName;
        this.firstName = firstName;
        this.admissionNumber = admissionNumber;
        this.admissionDate = admissionDate;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    // To String Method

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", admissionNumber='" + admissionNumber + '\'' +
                ", admissionDate=" + admissionDate +
                '}';
    }
}
