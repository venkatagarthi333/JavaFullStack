// service/StudentService.java
package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = repo.findById(id).orElseThrow();
        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());
        student.setCourse(studentDetails.getCourse());
        return repo.save(student);
    }
}
