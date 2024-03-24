package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService{
    private final ApplicationRepository applicationRepository;

    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public List<Application> getAll() {
        return applicationRepository.getAll();
    }

    @Override
    public List<Application> getByEmail(String email) {
        Optional<List<Application>> foundApplications = applicationRepository.findByEmail(email);

        List<Application> applications = null;

        if (foundApplications.isPresent()) {
            applications = foundApplications.get();
        }

        return applications;
    }

}
