package org.example.openfeign.api.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Huang Z.Y.
 */
@Configuration
public class OpenFeignConfiguration {

    /**
     * 全量日志
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
