package org.example.eureka.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Huang Z.Y.
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    // 开启使用服务名来调用接口
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
    