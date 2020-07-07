package com.wenxuan.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class miyaController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private Long age;

    @RequestMapping(value = "/miya")
    public String miya(){
        return name+":"+age;
    }
}
