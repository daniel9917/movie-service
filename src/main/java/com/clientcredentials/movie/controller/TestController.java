package com.clientcredentials.movie.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PreAuthorize("hasRole('admin_client')")
@RestController("/")
public class TestController {

    @GetMapping
    public String testEndpoint(){
        return "test-endpoint";
    }
}
