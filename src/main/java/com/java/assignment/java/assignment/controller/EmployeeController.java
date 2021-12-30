package com.java.assignment.java.assignment.controller;


import com.java.assignment.java.assignment.model.Employee;
import com.java.assignment.java.assignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;



    @RequestMapping("/")
    public List<Employee> getEmployeeName(){
        return employeeService.getEmployee();
    }

    @RequestMapping("/{id}")
    public List<Employee> getEmployeeByName(@PathVariable String id){
        return employeeService.getEmployeeByName(id);
    }

    @RequestMapping("/dept/{id}")
    public List<Employee> getEmployeeByDepartment(@PathVariable String id){
        return employeeService.getEmployeeByDepartmentId(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/")
    public Employee addEmployee(@RequestBody Employee employees){
        return employeeService.addEmployee(employees);
    }



    @RequestMapping(method = RequestMethod.PUT,value = "/emp/{id}")
    public String updateEmployeeNameById(@RequestBody String name,@PathVariable String id){
        return employeeService.updateEmployeeNameByEmployeeId(name,id);
    }




}
