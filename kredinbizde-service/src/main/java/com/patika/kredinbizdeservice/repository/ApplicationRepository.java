package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ApplicationRepository  {
    private final List<Application> applicationList = new ArrayList<>();

    public void save(Application application) {applicationList.add(application);}
    public List<Application> getAll() {
        return applicationList;
    }

    public Optional<List<Application>> findByEmail(String email) {
        return Optional.of(applicationList.stream()
                .filter(application -> application.getUser().getEmail().equals(email)).collect(Collectors.toList()));
    }

}