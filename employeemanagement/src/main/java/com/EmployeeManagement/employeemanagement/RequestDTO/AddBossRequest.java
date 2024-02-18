package com.EmployeeManagement.employeemanagement.RequestDTO;

import lombok.Data;

@Data

public class AddBossRequest {

    private Integer bossId;

    private String bossName;
    private double bosssalary;
    private int age;
    private double bossRating;
}
