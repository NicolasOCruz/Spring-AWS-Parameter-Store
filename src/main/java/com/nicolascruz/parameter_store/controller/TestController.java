package com.nicolascruz.parameter_store.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

    @Value("${process.api.url}")
    private String processUrl;

    @Value("${process.api.user}")
    private String processUser;

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok(processUrl.concat(" - ").concat(processUser));
    }
}
