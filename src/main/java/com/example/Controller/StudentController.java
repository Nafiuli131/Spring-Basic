package com.example.Controller;

import com.example.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
//    return a bean class object
    @GetMapping(path = "/student")
    public Student getStudentInfo(){
        return new Student("Nafiul","Islam");
    }

    //return a list of object
    @GetMapping("/students")
    public List<Student> getStudentList(){
        List<Student> addStudent = new ArrayList<>();
        addStudent.add(new Student("john","cena"));
        addStudent.add(new Student("tony","cruise"));
        addStudent.add(new Student("kuber","majhi"));
        addStudent.add(new Student("montu","mia"));
        return addStudent;
    }
}
