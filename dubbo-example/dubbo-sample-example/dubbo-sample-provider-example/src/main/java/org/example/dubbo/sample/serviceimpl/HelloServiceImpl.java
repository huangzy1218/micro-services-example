package org.example.dubbo.sample.serviceimpl;

import org.example.dubbo.sample.api.HelloService;

/**
 * @author Huang Z.Y.
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
