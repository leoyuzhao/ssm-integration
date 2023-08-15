package com.yzf.ssm;

import com.yzf.ssm.entity.Emp;
import com.yzf.ssm.service.api.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @description: 测试事务
 * @author leo
 * @date 2023/8/14 16:46
 * @version 1.0
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-persist.xml")
public class Test03 {

    @Autowired
    private EmpService empService;

    @Test
    public void test01(){
        List<Emp> emps = empService.getAll();
        log.info("empList：" + emps);
    }


}
