package com.EmployeeManagement.employeemanagement.Service;

import com.EmployeeManagement.employeemanagement.Entity.Employee;
import com.EmployeeManagement.employeemanagement.Repository.EmployeeRepository;
import com.EmployeeManagement.employeemanagement.RequestDTO.AddEmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public  String AddEmployee(AddEmployeeRequest addEmployeeRequest){

        Employee employee=Employee.builder()
                .EmpName(addEmployeeRequest.getEmpName())
                .EmpSalary(addEmployeeRequest.getEmpSalary())
                .age(addEmployeeRequest.getAge())
                .EmpRating(addEmployeeRequest.getEmpRating())
                .build();
        employee=employeeRepository.save(employee);
        return "Employee Added Successfully with EmployeID:-"+employee.getEmpId();
    }
    public List<Employee> findEmployee(int age,int x){
//        List<Employee> allEmployees = employeeRepository.findAll();
//        List<Employee> filteredEmployees = new ArrayList<>();
//
//        for (Employee employee : allEmployees) {
//            if (employee.getAge() > age && employee.getEmpRating() > x) {
//                filteredEmployees.add(employee);
//            }
//        }
//
//        return filteredEmployees;
        return employeeRepository.findByAgeAndRatingGreaterThan(age,x);
    }
    public List<Employee> findEmp(){
        return employeeRepository.findAll();
    }
}
