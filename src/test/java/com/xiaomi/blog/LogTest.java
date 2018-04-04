package com.xiaomi.blog;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述：〈日志测试〉
 *
 * @author liyaohua
 * create on 2018/4/4
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void testone(){
        //log.info("hello");
        logger.info("hello");
    }
}
