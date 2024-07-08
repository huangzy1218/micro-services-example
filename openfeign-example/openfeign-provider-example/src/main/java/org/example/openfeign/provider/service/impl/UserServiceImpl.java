package org.example.openfeign.provider.service.impl;

import org.example.openfeign.api.User;
import org.example.openfeign.provider.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Huang Z.Y.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("Huang Z.Y.");
        user.setAge(21);
        return user;
    }

}
