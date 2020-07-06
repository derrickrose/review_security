package com.review.tech.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
@RestController
public class LandingPageController{

    @RolesAllowed("USER")
    @GetMapping("/**")
    public String getUser()
    {
        return "Welcome User";
    }

    @RolesAllowed({"USER","ADMIN"})
    @GetMapping("/admin")
    public String getAdmin()
    {
        return "Welcome Admin";
    }

    @GetMapping("/*")
    public String getGithub()
    {
        return "Welcome Github user!";
    }
}