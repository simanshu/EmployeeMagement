package com.EmployeeManagement.employeemanagement.RequestDTO;

import lombok.Data;

@Data
public class AddEmployeeRequest {
//  private Integer EmpId;

    private String EmpName;
    private double EmpSalary;
    private int age;
    private double EmpRating;
}
