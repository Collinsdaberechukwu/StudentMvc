package com.example.studentmvc.service.studentImplementation;

import com.example.studentmvc.entity.Students;
import com.example.studentmvc.repo.StudentRepo;
import com.example.studentmvc.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StudentImplement implements StudentService {
    public final StudentRepo studentRepo;
    @Override
    public Students getStudentsById(Long id) {
       return studentRepo.save(studentRepo.getReferenceById(id));
//       return studentRepo.findById(id).get();
    }


    @Override
    public Students InsertStudents(Students students) {
      return studentRepo.save(students);
    }
}
