package com.telusko.part29springsecex.service;

import org.springframework.stereotype.Service;

@Service
public class JWTService {

    public String generateToken() {
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6Ik5hdmluIiwiaWF0IjoxNTE2MjM5MDIyLCJleHAiOjE1MTYyNDAyNH0.SVkl_u2Ev7ThYMAcSosUv5n1IN40e4kD87SO4Gnz8IQ";
    }
}
