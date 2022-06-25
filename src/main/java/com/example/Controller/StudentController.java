package com.example.Controller;

import com.example.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping(path = "/student")
    public Student getStudentInfo(){
        return new Student("Nafiul","Islam");
    }
}
