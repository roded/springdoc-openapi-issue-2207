package com.example.springdocopenapiissue2207.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

@RestController
public class MyController {

    @GetMapping("/default-charset")
    public String list() {
        return Charset.defaultCharset().name();
    }
}
