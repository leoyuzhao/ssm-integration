package com.yzf.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzf.ssm.entity.Emp;
import com.yzf.ssm.mapper.EmpMapper;
import com.yzf.ssm.service.api.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
 
    @Autowired
    private EmpMapper empMapper;
 
    @Override
    @Transactional(readOnly = true)
    public List<Emp> getAll() {
        return empMapper.selectAll();
    }

    @Override
    public PageInfo<Emp> queryPage(Integer pageNo) {
        PageHelper.startPage(pageNo, 5);
        List<Emp> empList = empMapper.selectAll();
        PageInfo<Emp> empPageInfo = new PageInfo<>(empList);
        return empPageInfo;
    }
}