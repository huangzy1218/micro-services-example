package org.example.provider.sample;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.example.provider.serviceimpl.GreetingServiceImpl;

/**
 * @author Huang Z.Y.
 */
public class DubboSampleApplication {

    private static final String ZOOKEEPER_ADDRESS = "zookeeper://39.107.235.5:2181";

    public static void main(String[] args) {
        // 定义 service 信息
        ServiceConfig<GreetingService> service = new ServiceConfig<>();
        service.setInterface(GreetingService.class);
        service.setRef(new GreetingServiceImpl());

        // 启动 Dubbo
        DubboBootstrap.getInstance()
                .application("dubbo-provider")
                .registry(new RegistryConfig(ZOOKEEPER_ADDRESS))
                .protocol(new ProtocolConfig("dubbo", -1))
                .service(service)
                .start();
    }

}
