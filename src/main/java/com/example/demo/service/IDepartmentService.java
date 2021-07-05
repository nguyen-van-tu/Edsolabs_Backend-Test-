package com.example.demo.service;

import com.example.demo.model.Department;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IDepartmentService {
    List<Department> findALl();

    Department findById(Long id);

    Department save(Department t);

    void remove(Long id);

    List<Department> findByName(String name);


}
