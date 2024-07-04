package org.example.dubbo.springboot.serviceimpl;


import com.alibaba.dubbo.config.annotation.Service;
import org.example.dubbo.springboot.api.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author Huang Z.Y.
 */
@Component
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
