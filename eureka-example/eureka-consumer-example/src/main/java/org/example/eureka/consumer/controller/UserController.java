package org.example.eureka.consumer.controller;

import org.example.eureka.consumer.dto.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Huang Z.Y.
 */
@RestController
public class UserController {

    @Resource
    RestTemplate restTemplate;

    String URL_PREFIX = "http://EUREKA-PROVIDER";

    @GetMapping("/getUser/{userId}")
    public BaseResponse getUser(@PathVariable String userId){
        ResponseEntity<BaseResponse> forEntity = restTemplate.getForEntity(URL_PREFIX+"/user/getUserById/" + userId, BaseResponse.class);
        return forEntity.getBody() ;
    }

}
    