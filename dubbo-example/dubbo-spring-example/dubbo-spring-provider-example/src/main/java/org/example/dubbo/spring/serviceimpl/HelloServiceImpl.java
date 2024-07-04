package org.example.dubbo.spring.serviceimpl;

import org.example.dubbo.spring.service.HelloService;

/**
 * @author Huang Z.Y.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
