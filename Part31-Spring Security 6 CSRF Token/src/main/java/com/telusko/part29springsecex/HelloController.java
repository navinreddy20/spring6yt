package com.telusko.part29springsecex;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Welcome to Telusko "+request.getSession().getId();
    }

}
