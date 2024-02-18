package com.EmployeeManagement.employeemanagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "boss")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Boss {
    @Id
    private Integer bossId;

    private String bossName;
    private double bosssalary;
    private int age;
    private double bossRating;


}
