package com.example.studentmvc.controller;


import com.example.studentmvc.entity.Students;
import com.example.studentmvc.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentController {
    public final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/students/{id}")
    public Students getStudentById(@PathVariable Long id){
        return service.getStudentsById(id);
    }

    @PostMapping("insert")
    public Students insertStudent(Students students){
        return service.InsertStudents(students);
    }
}
