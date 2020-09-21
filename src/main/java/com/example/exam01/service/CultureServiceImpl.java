package com.example.exam01.service;

import com.example.exam01.dao.CultureResultMapper;
import com.example.exam01.pojo.culture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "CultureService")
@Primary
public class CultureServiceImpl implements CultureService {
    @Autowired
    private CultureResultMapper cultureResultMapper;

    @Override
    public List<culture> getCultureResult() {
        return cultureResultMapper.selectCultureList();
    }
}
