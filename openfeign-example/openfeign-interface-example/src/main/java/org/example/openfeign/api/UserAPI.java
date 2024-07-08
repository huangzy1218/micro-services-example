package org.example.openfeign.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public interface UserAPI {

    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);

}
