package com.microservices.cloud.gateway;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FalBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "User Service is taking Longer than expected."+"" +
                "please try again some time";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){
        return "Department Service is taking Longer than expected."+"" +
                "please try again some time";
    }

    @PostMapping("/userServiceFallBack")
    public String userPostServiceFallBackMethod(){
        return "User Service is taking Longer than expected."+"" +
                "please try again some time";
    }

    @PostMapping("/departmentServiceFallBack")
    public String departmentPostServiceFallBackMethod(){
        return "Department Service is taking Longer than expected."+"" +
                "please try again some time";
    }
}
