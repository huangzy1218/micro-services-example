package org.example.nacos.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

/**
 * @author Huang Z.Y.
 */
@EnableDubbo(scanBasePackages = "org.example.nacos.dubbo.service")
@PropertySource(value = "classpath:/provider-config.properties")
public class DubboServiceProviderBootstrap {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DubboServiceProviderBootstrap.class);
        context.refresh();
        System.out.println("HelloService provider is starting...");
        System.in.read();
    }

}
