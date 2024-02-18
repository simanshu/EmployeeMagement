package com.EmployeeManagement.employeemanagement.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer EmpId;

    private String EmpName;
    private double EmpSalary;
    private int age;
    private double EmpRating;
}
