package org.example.dubbo.springboot.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.dubbo.springboot.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huang Z.Y.
 */
@RestController
public class HelloController {

    // @Reference 已过时
    @DubboReference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return helloService.sayHello(name);
    }
}
