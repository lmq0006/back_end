package com.example.exam01.service;

import com.example.exam01.dao.BornResultMapper;
import com.example.exam01.pojo.born;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "BornService")
@Primary
public class BornServiceImpl implements BornService {
    @Autowired
    private BornResultMapper bornResultMapper;

    @Override
    public List<born> getBornResult() {
        return bornResultMapper.selectBornList();
    }
}
