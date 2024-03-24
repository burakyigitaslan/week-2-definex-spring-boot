package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Application;

import java.util.List;

public interface ApplicationService {
    Application save(Application application);
    List<Application> getAll();
    List<Application> getByEmail(String email);
}
