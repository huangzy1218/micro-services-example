package example.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huang Z.Y.
 */
@RestController
public class HelloController {

    // @Reference 已过时
    @DubboReference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.sayHello("World");
    }
}
