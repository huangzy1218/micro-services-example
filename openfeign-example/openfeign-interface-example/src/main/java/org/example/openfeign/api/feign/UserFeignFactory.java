package org.example.openfeign.api.feign;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Huang Z.Y.
 */
@Component
public class UserFeignFactory implements FallbackFactory<UserFeignFallback> {

    private final UserFeignFallback userFeignFallback;

    public UserFeignFactory(UserFeignFallback userFeignFallback) {
        this.userFeignFallback = userFeignFallback;
    }

    @Override
    public UserFeignFallback create(Throwable cause) {
        cause.printStackTrace();
        return userFeignFallback;
    }

}
