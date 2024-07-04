package org.example.nacos.springboot.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Huang Z.Y.
 */
@Controller
@RequestMapping("config")
public class ConfigController {

    // 设置属性值
    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @GetMapping("/get")
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }

}
