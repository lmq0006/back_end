package com.example.exam01.controller;

import com.example.exam01.pojo.engskill;
import com.example.exam01.service.CultureService;
import com.example.exam01.service.EngskillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EngskillController {
    @Autowired
    EngskillService engskillService;
    @GetMapping("/engskill")
    public List<engskill> getEngskillList() {
        return engskillService.getEngskillResult();
    }
}
