package org.example.nacos.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.example.nacos.dubbo.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.io.IOException;

/**
 * @author Huang Z.Y.
 */
@EnableDubbo
@PropertySource(value = "classpath:/consumer-config.properties")
public class DubboServiceConsumerBootstrap {

    @Reference(version = "${demo.service.version}")
    private HelloService helloService;

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DubboServiceConsumerBootstrap.class);
        context.refresh();
        context.close();
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < 10; i++) {
            System.out.println(helloService.sayHello("Nacos"));
        }
    }

}
