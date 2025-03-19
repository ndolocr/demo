package com.example.demo.school;

public class School {
    private Long id;
    private String name;
    private String alias;
    private String email;
    private String address;
    private String location;

    public School() {}

    public School(String name, String alias, String email, String address, String location) {
        this.name = name;
        this.alias = alias;
        this.email = email;
        this.address = address;
        this.location = location;
    }

    public School(Long id, String name, String alias, String email, String address, String location) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.email = email;
        this.address = address;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
