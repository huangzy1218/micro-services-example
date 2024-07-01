package org.example.provider.sample;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.example.HelloService;
import org.example.provider.serviceimpl.HelloServiceImpl;

/**
 * @author Huang Z.Y.
 */
public class DubboSampleApplication {

    private static final String ZOOKEEPER_ADDRESS = "zookeeper://39.107.235.5:2181";

    public static void main(String[] args) {
        // Define all services
        ServiceConfig<HelloService> service = new ServiceConfig<>();
        service.setInterface(HelloService.class);
        service.setRef(new HelloServiceImpl());
        service.setGroup("test");
        service.setVersion("1.0.0");


        // Start Dubbo
        DubboBootstrap.getInstance()
                .application("dubbo-provider")
                .registry(new RegistryConfig(ZOOKEEPER_ADDRESS))
                .protocol(new ProtocolConfig("dubbo", -1))
                .service(service)
                .start();
    }

}
