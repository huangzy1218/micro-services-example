package org.example.dubbo.springboot.serviceimpl;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.dubbo.springboot.api.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author Huang Z.Y.
 */
@Component
@DubboService(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
