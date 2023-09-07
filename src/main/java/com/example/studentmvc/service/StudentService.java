package com.example.studentmvc.service;

import com.example.studentmvc.entity.Students;

public interface StudentService {
    public Students getStudentsById(Long id);
    public Students InsertStudents(Students students);
}
