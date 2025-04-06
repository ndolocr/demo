package com.example.demo.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {
    @GetMapping("/publishers")
    public List<String> publishers(){
        return List.of(
                "Longhorn",
                "KIE",
                "crn"
        );
    }
}
