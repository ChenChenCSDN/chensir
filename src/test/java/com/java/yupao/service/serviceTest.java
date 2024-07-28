package com.java.yupao.service;
import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * ClassName: serviceTest
 * Package: com.java.usercenter.service
 * Description:
 *
 * @Author chen_sir
 * @Create 2024/6/13 10:15
 * @Version 1.0
 */
@SpringBootTest
public class serviceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAdduser(){
        //使用generator进行自动填充user实例
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1,1);

    }
}
