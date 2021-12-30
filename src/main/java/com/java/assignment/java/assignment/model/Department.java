package com.java.assignment.java.assignment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {

    @Id
    @SequenceGenerator(
            name = "serial_sequence",
            sequenceName = "serial_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "serial_sequence"
    )
    private Long sNo;
    private String departmentId;
    private String departmentName;
    private String departmentLocation;
}
