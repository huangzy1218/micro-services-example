package org.example.dubbo.sample;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.example.dubbo.sample.api.HelloService;

import java.io.IOException;

/**
 * @author Huang Z.Y.
 */
public class DubboConsumerApplication {

    public static void main(String[] args) throws IOException {
        ReferenceConfig<HelloService> reference = new ReferenceConfig<>();
        reference.setInterface(HelloService.class);

        DubboBootstrap.getInstance()
                .application("dubbo-example-consumer")
                .registry(new RegistryConfig("zookeeper://39.107.235.5:2181"))
                .reference(reference);

        HelloService service = reference.get();
        String message = service.sayHello("Dubbo");
        System.out.println("Receive result ======> " + message);
        System.in.read();
    }

}
