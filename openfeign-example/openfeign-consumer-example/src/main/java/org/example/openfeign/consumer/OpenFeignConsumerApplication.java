package org.example.openfeign.consumer;

import org.example.openfeign.api.client.UserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Huang Z.Y.
 */
@SpringBootApplication
@EnableFeignClients(clients = {UserClient.class})
@EnableDiscoveryClient
public class OpenFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignConsumerApplication.class, args);
    }

}
