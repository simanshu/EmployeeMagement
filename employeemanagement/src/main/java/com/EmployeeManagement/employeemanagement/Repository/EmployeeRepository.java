package com.EmployeeManagement.employeemanagement.Repository;

import com.EmployeeManagement.employeemanagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query("SELECT e FROM Employee e WHERE e.age > :age AND e.EmpRating > :rating")
    List<Employee> findByAgeAndRatingGreaterThan(@Param("age") int age, @Param("rating") int rating);
}
