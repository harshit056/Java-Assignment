package com.java.assignment.java.assignment.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
public class Employee {

    @Id
    private String employeeId;
    private String employeeName;
    private String employeeContact;
    private String employeeEmailId;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(

            name = "employee_id",
            referencedColumnName = "employeeId"
    )
    private List<Department> departments;


}
