package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Campaign;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CampaignService {
    Campaign save(Campaign campaign);
    List<Campaign> getAll();
    List<Campaign> getAllCampaignsSortedByCreateDateDescending();
}
