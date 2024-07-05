package org.example.nacos.dubbo.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Huang Z.Y.
 */
@Service(version = "${example.service.version}")
public class HelloServiceImpl implements HelloService {

    @Value("${example.service.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                serviceName,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }

}