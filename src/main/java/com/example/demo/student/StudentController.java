package com.example.demo.student;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//(path = "api/v1/student")
@RestController
@RequestMapping
public class StudentController {

    @GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index() {
        return "This is Home page";
    }


//    @GetMapping(value="/")
//    public Student getStudents(){
//        Student student = new Student(1L,
//                "Mariam",
//                "mariamjamal@gmail.com",
//                LocalDate.of(2000, Month.JANUARY,5),
//                21);
//        return student;
//    }
}
