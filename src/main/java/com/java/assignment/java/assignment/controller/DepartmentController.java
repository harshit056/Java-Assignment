package com.java.assignment.java.assignment.controller;

import com.java.assignment.java.assignment.model.Department;
import com.java.assignment.java.assignment.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/")
    public List<Department> getDepartment(){
        return departmentService.getAllDepartment();
    }

    @RequestMapping("/{id}")
    public List<Department> getDepartmentById(@PathVariable String id){
        return departmentService.getDepartmentById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/")
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/{id}")
    public String updateDepartmentNameByDepartmentId(@RequestBody String name,@PathVariable String id ){
        return departmentService.updateDepartmentNameByDepartmentId(name,id);
    }
}
