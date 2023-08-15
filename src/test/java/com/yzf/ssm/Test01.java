package com.yzf.ssm;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @description: 测试数据源是否正常
 * @author leo
 * @date 2023/8/14 16:47
 * @version 1.0
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-persist.xml")
public class Test01 {

    @Autowired
    private DataSource dataSource;

    @Test
    public void test01() throws SQLException {
        Connection connection = dataSource.getConnection();
        log.info("connection：" + connection);
    }

}
