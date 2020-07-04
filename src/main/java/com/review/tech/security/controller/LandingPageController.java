package com.review.tech.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class LandingPageController {

    @RolesAllowed("USER")
    @GetMapping("/users")
    public String getUserLandingPage() {
        return "Welcome user";
    }

    @RolesAllowed("ADMIN")
    @GetMapping("/admins")
    public String getAdminLandingPage() {
        return "Welcome admin";
    }
}
