package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @GetMapping()
    public ResponseEntity<List<Department>> getAll() {
        return new ResponseEntity<>(departmentService.findALl(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Department> create(@RequestBody Department department) {
        departmentService.save(department);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Department> edit(@PathVariable Long id, @RequestBody Department department) {
        department.setId(id);
        departmentService.save(department);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Department> delete(@PathVariable Long id) {
        departmentService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getDepartmentByName")
    public ResponseEntity<List<Department>> getDepartmentByName(String name) {
        return new ResponseEntity<>(departmentService.findByName(name), HttpStatus.OK);
    }
}