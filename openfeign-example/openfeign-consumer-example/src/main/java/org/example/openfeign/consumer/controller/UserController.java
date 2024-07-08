package org.example.openfeign.consumer.controller;

import org.example.openfeign.api.User;
import org.example.openfeign.api.UserAPI;
import org.example.openfeign.api.client.UserClient;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Huang Z.Y.
 */
@RestController
public class UserController implements UserAPI {

    @Resource
    private UserClient userClient;

    @Override
    public User findById(Long id) {
        return userClient.findById(id);
    }

}
