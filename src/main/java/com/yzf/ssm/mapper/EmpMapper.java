package com.yzf.ssm.mapper;

import com.yzf.ssm.entity.Emp;
import java.util.List;

public interface EmpMapper {
    List<Emp> selectAll();
}