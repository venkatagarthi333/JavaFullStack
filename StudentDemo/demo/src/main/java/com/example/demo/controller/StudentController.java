// controller/StudentController.java
package com.example.demo.controller;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    /*@GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.getStudentById(id);
    }*/

    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    /*@PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }*/

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
}
