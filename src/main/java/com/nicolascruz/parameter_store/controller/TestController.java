package com.nicolascruz.parameter_store.controller;

import com.nicolascruz.parameter_store.properties.ProcessProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private final ProcessProperties properties;

    public TestController(ProcessProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok(properties.getUrl()
                .concat(" - ")
                .concat(properties.getUser()));
    }
}
