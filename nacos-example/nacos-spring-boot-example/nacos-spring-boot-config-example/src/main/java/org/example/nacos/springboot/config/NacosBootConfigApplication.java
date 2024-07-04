package org.example.nacos.springboot.config;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Huang Z.Y.
 */
@SpringBootApplication
// 加载 dataId 为 example 的配置源，开启自动更新
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class NacosBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosBootConfigApplication.class, args);
    }

}
