package example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.example.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.sayHello("Niki");
        System.out.printf(helloService.sayHello("Tom"));
        return hello;
    }
}
