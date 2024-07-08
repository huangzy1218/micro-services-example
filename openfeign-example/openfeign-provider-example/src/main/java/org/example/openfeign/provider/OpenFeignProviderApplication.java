package org.example.openfeign.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Huang Z.Y.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OpenFeignProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignProviderApplication.class, args);
    }

}
