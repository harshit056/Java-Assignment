package com.java.assignment.java.assignment.service;

import com.java.assignment.java.assignment.Repository.EmployeeRepository;
import com.java.assignment.java.assignment.model.Employee;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Builder
public class EmployeeService {


        @Autowired
        private EmployeeRepository employeeRepository;


    public Employee addEmployee(Employee employees) {


        Employee employee = Employee.builder().employeeId(employees.getEmployeeId())
                .employeeEmailId(employees.getEmployeeEmailId())
                .employeeName(employees.getEmployeeName())
                .employeeContact(employees.getEmployeeContact())
                .departments(employees.getDepartments())
                .build();
        employeeRepository.save(employee);
        return employee;
    }


    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeeByName(String id) {
    return employeeRepository.findByEmployeeId(id);
    }

    public List<Employee> getEmployeeByDepartmentId(String id) {
        return employeeRepository.findByDepartmentsDepartmentId(id);
    }



    public String updateEmployeeNameByEmployeeId(String name, String id) {
        employeeRepository.updateEmployeeNameByEmployeeId(name,id);
        return "True";
    }


}
