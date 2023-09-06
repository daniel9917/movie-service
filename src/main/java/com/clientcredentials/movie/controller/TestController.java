package com.clientcredentials.movie.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {

    @GetMapping
    @PreAuthorize("hasRole('admin_client') or hasRole('user_client')")
    public String testEndpoint(){
        return "test-endpoint";
    }

    @GetMapping("admin")
    @PreAuthorize("hasRole('admin_client')")
    public String helloAdmin(){
        return "test-endpoint-admin";
    }

    @GetMapping("user")
    @PreAuthorize("hasRole('user_client')")
    public String helloUser(){
        return "test-endpoint-user";
    }
}
