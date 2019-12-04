package com.pudding.april.web;

import com.pudding.april.common.cache.RedisHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CsjWmsWebApplicationTests {
    @Autowired
    RedisHelper redisHelper;
    @Test
    public void contextLoads() {
        redisHelper.set("test","liuxh");
        System.out.println(redisHelper.get("test"));
    }

}
