package com.wallet.blasko.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8100", "http://192.168.1.239:8100"})
public class DataController {

    @GetMapping("/")
    public String getAllAccounts() {
        return "hello world :)";
    }

}
