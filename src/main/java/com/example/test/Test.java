package com.example.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangbingbing
 * @Description:
 * @Date: Create in 16:50 2019/10/15
 */
@RestController
public class Test {
    @RequestMapping("/test")
    public String test(){
        return "hello world----->jenkins!!!";
    }
}
