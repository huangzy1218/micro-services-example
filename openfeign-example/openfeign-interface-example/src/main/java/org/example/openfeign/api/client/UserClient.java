package org.example.openfeign.api.client;

import org.example.openfeign.api.UserAPI;
import org.example.openfeign.api.config.OpenFeignConfiguration;
import org.example.openfeign.api.feign.UserFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Huang Z.Y.
 */
@FeignClient(value = "openfeign-provider",
        configuration = OpenFeignConfiguration.class
        , fallback = UserFeignFallback.class
        /*, fallbackFactory = UserFeignFactory.class*/)
public interface UserClient extends UserAPI {
}
