package com.java.assignment.java.assignment.service;

import com.java.assignment.java.assignment.Repository.DepartmentRepository;
import com.java.assignment.java.assignment.model.Department;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Builder
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public Department addDepartment(Department department) {
        Department department1 = Department.builder()
                .departmentId(department.getDepartmentId())
                .departmentName(department.getDepartmentName())
                .departmentLocation(department.getDepartmentLocation())
                .build();
        departmentRepository.save(department1);
        return department1;
    }

    public List<Department> getDepartmentById(String id) {
        return departmentRepository.findByDepartmentId(id);
    }

    public String updateDepartmentNameByDepartmentId(String name, String id) {
        departmentRepository.updateDepartmentNameByDepartmentId(name,id);
        return "True";
    }
}
