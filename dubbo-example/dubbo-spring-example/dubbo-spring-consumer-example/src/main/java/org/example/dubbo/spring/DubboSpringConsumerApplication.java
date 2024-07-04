package org.example.dubbo.spring;

import org.example.dubbo.spring.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Huang Z.Y.
 */
public class DubboSpringConsumerApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-example-consumer.xml");
        context.start();
        HelloService helloService = (HelloService) context.getBean("helloService");

        String message = helloService.sayHello("Dubbo");
        System.out.println("Receive result ======> " + message);
        System.in.read();
        System.exit(0);
    }

}
