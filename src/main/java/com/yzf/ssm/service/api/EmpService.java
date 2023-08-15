package com.yzf.ssm.service.api;

import com.github.pagehelper.PageInfo;
import com.yzf.ssm.entity.Emp;

import java.util.List;

public interface EmpService {

    public List<Emp> getAll();

    PageInfo<Emp> queryPage(Integer pageNo);
}
