//មុខងារ៖ ទទួល HTTP Request ពី Browser។
package com.spring.banking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//annotation
@RestController
public class AccountController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Banking System!";
    }
}
