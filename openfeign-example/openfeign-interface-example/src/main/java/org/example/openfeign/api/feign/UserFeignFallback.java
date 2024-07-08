package org.example.openfeign.api.feign;

import org.example.openfeign.api.User;
import org.example.openfeign.api.UserAPI;
import org.springframework.stereotype.Component;

/**
 * @author Huang Z.Y.
 */
@Component
public class UserFeignFallback implements UserAPI {

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setName("unKnown");
        user.setAge(-1);
        return user;
    }

}
