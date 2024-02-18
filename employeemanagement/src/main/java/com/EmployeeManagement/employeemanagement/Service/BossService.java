package com.EmployeeManagement.employeemanagement.Service;

import com.EmployeeManagement.employeemanagement.Entity.Boss;
import com.EmployeeManagement.employeemanagement.Repository.BossRepository;
import com.EmployeeManagement.employeemanagement.RequestDTO.AddBossRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BossService {
    @Autowired
    BossRepository bossRepository;

    public String AddBoss(AddBossRequest addBossRequest){
        Boss boss= Boss.builder()
                .bossId(addBossRequest.getBossId())
                .bossName(addBossRequest.getBossName())
                .age(addBossRequest.getAge())
                .bossRating(addBossRequest.getBossRating())
                .bosssalary(addBossRequest.getBosssalary())
                .build();
       boss= bossRepository.save(boss);
       return "Boss Add Successfully BossID:-"+boss.getBossId();
    }
    public List<Boss> findBoss(int age,int x){
//        List<Boss> allboss=bossRepository.findAll();
//        List<Boss> newList=new ArrayList<>();
//        for(Boss boss:allboss){
//            if(boss.getAge()>age&&boss.getBossRating()>x){
//                newList.add(boss);
//            }
//        }
//        return newList;
        return bossRepository.findbosswithageandrating(age,x);
    }
}
