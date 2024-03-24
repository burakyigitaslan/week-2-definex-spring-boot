package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.service.ApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {
    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<Application> getAll() {
        return applicationService.getAll();
    }

    @GetMapping("/{email}")
    public ResponseEntity<List<Application>> getByEmail(@PathVariable String email) {
        List<Application> applications = applicationService.getByEmail(email);
        if (!applications.isEmpty()) {
            return ResponseEntity.ok().body(applications);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
