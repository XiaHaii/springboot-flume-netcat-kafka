package com.wang.bigdata.flume;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogbackFlumeApplicationTests {
    // 来源： https://blog.csdn.net/justry_deng/article/details/88388748
    // https://blog.csdn.net/a_drjiaoda/article/details/85003929
    private static final Logger logger = LoggerFactory.getLogger(LogbackFlumeApplication.class);

    @Test
    public void contextLoads() {

        for(int i = 0; i <= 10; i++){
            logger.info("我是第" + i + "条信息");
        }
        try{
            Thread.sleep(20000);
        }catch (Exception e){
            logger.error("异常", e);
        }

    }

}
