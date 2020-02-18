package com.fullproject.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzhiheng
 * @version 1.0
 * @date 2020/2/18 9:58
 * @describe:我已经修改过了，我是老大，我已经看到了。
 * 已更新
 */
@RestController
@RequestMapping("/addClass")
public class AddClass {
    @RequestMapping("/testClass")
    public String testClass(){
        return "nss1";
    }
}
