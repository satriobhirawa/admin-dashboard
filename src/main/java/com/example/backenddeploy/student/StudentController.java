package com.example.backenddeploy.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    //Exposed as endpoint
    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(1L,"Bhirawa","bhir@gmail.com",Gender.MALE),
                new Student(2L,"Satrio","sat@gmail.com",Gender.MALE)
        );
        return students;
    }
}
