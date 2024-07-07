package org.example.eureka.provider.controller;

import org.example.eureka.provider.dto.BaseResponse;
import org.example.eureka.provider.dto.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huang Z.Y.
 */
@RestController
public class UserController {

    @GetMapping("/user/getUserById/{userId}")
    public BaseResponse getUserById(@PathVariable String userId) {
        // 模拟用户信息
        UserInfo userInfo = new UserInfo();
        userInfo.setId(userId);
        userInfo.setName("John Doe");
        userInfo.setAge(30);

        BaseResponse response = new BaseResponse();
        response.setStatus("success");
        response.setMessage("User retrieved successfully");
        response.setData(userInfo);

        return response;
    }
}
    