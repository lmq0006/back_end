package com.example.exam01.service;

import com.example.exam01.dao.EngskillResultMapper;
import com.example.exam01.pojo.engskill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "EngskillService")
@Primary
public class EngskillServiceImpl implements EngskillService {
    @Autowired
    private EngskillResultMapper engskillResultMapper;
    @Override
    public List<engskill> getEngskillResult() {
        return engskillResultMapper.selectEngskillList();
    }
}
