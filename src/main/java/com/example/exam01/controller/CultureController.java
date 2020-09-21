package com.example.exam01.controller;

import com.example.exam01.common.api.CommonResult;
import com.example.exam01.pojo.culture;
import com.example.exam01.service.CultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CultureController {
    @Autowired
    CultureService cultureService;
    @GetMapping("/culture")
    //@PreAuthorize("hasAuthority('query')")
    public List<culture> getCultureList() {
        //return userResultService.getDepartmentResultByScore();
        //Map<String, List<Map<String, Object>>> result = new HashMap<>();
        List<culture> result = new ArrayList<culture>();
        //result.put("companyRank", cultureService.getCultureResult());
        return cultureService.getCultureResult();
    }
}
