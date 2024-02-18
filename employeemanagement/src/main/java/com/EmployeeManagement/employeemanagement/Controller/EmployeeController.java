package com.EmployeeManagement.employeemanagement.Controller;

import com.EmployeeManagement.employeemanagement.Entity.Employee;
import com.EmployeeManagement.employeemanagement.RequestDTO.AddEmployeeRequest;
import com.EmployeeManagement.employeemanagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/AddEmployee")
    public ResponseEntity AddEmp(@RequestBody AddEmployeeRequest addEmployeeRequest){
        String result=employeeService.AddEmployee(addEmployeeRequest);
        return new ResponseEntity(result,HttpStatus.OK);
    }

    @GetMapping("/findEmployee")
    public List<Employee> findEmployee(@RequestParam("age") int age,@RequestParam("rating") int x){
        return employeeService.findEmployee(age,x);
    }
    @GetMapping("/emp")
    public List<Employee> findEmp(){
        return employeeService.findEmp();
    }
}
