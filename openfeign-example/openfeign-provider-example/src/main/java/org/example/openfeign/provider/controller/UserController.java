package org.example.openfeign.provider.controller;

import org.example.openfeign.api.User;
import org.example.openfeign.api.UserAPI;
import org.example.openfeign.provider.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Huang Z.Y.
 */
@RestController
public class UserController implements UserAPI {

    @Resource
    private UserService userService;

    @Override
    public User findById(Long id) {
        return userService.findById(id);
    }
}
