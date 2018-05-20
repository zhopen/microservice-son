package com.hpe.son;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;

@RestController
public class SonController {
    @RequestMapping("/where")
    public String where(){
        String where = ManagementFactory.getRuntimeMXBean().getName();
        return "I am at " + where;
    }
}

