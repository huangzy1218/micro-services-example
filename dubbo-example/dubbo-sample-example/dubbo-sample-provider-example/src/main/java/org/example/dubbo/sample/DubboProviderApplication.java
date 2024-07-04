package org.example.dubbo.sample;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.example.dubbo.sample.api.HelloService;
import org.example.dubbo.sample.serviceimpl.HelloServiceImpl;

/**
 * @author Huang Z.Y.
 */
public class DubboProviderApplication {

    public static void main(String[] args) {
        // 定义具体的服务
        ServiceConfig<HelloService> service = new ServiceConfig<>();
        service.setInterface(HelloService.class);
        service.setRef(new HelloServiceImpl());

        // 启动 Dubbo
        DubboBootstrap.getInstance()
                .application("dubbo-example-provider")
                .registry(new RegistryConfig("zookeeper://39.107.235.5:2181"))
                .protocol(new ProtocolConfig("dubbo", -1))
                .service(service)
                .start()
                .await();
    }

}
