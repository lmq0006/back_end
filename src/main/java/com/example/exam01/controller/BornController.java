package com.example.exam01.controller;

import com.example.exam01.pojo.born;
import com.example.exam01.service.BornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BornController {
    @Autowired
    BornService bornService;
    @GetMapping("/born")
    //@PreAuthorize("hasAuthority('query')")
    public List<born> getBornList() {
        //return userResultService.getDepartmentResultByScore();
        //Map<String, List<Map<String, Object>>> result = new HashMap<>();
        List<born> result = new ArrayList<born>();
        //result.put("companyRank", cultureService.getCultureResult());
        return bornService.getBornResult();
    }
}
