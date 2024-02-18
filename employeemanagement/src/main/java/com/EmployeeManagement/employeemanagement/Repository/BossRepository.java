package com.EmployeeManagement.employeemanagement.Repository;

import com.EmployeeManagement.employeemanagement.Entity.Boss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BossRepository extends JpaRepository<Boss,Integer> {
    @Query("select b from Boss b where b.age>:age and b.bossRating>:rating")
    List<Boss> findbosswithageandrating(@Param("age") int age, @Param("rating") int rating);
}
