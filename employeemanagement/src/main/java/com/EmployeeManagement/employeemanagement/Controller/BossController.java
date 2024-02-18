package com.EmployeeManagement.employeemanagement.Controller;

import com.EmployeeManagement.employeemanagement.Entity.Boss;
import com.EmployeeManagement.employeemanagement.RequestDTO.AddBossRequest;
import com.EmployeeManagement.employeemanagement.Service.BossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("boss")
public class BossController {
    @Autowired
    BossService bossService;

    @PostMapping("/AddBoss")
    public ResponseEntity AddBoss(@RequestBody AddBossRequest addBossRequest){
        String result=bossService.AddBoss(addBossRequest);
        return new ResponseEntity(result, HttpStatus.OK);
    }
    @GetMapping("/findboss")
    public List<Boss> findBoss(@RequestParam("age") int age,@RequestParam("rating") int x){
        return bossService.findBoss(age,x);
    }
}
