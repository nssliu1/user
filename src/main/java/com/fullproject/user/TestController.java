package com.fullproject.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzhiheng
 * @version 1.0
 * @date 2020/2/18 9:28
 * @describe:
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @ResponseBody
    @RequestMapping("/test1")
    public String test1(){
        return "nss";
    }
}
