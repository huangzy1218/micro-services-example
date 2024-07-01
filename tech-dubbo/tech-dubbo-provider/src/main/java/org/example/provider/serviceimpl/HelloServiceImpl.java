package org.example.provider.serviceimpl;


import org.example.HelloService;

/**
 * @author Huang Z.Y.
 */
//@Component
//@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
