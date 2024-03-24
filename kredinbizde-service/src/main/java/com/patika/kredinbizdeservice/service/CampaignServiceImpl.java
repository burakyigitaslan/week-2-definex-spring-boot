package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.repository.CampaignRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignServiceImpl implements CampaignService{
    private final CampaignRepository campaignRepository;

    public CampaignServiceImpl(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    @Override
    public Campaign save(Campaign campaign) {
        campaignRepository.save(campaign);

        return campaign;
    }

    @Override
    public List<Campaign> getAll() {
        return campaignRepository.getAll();
    }

    @Override
    public List<Campaign> getAllCampaignsSortedByCreateDateDescending() {

        return campaignRepository.getAllCampaignsSortedByCreateDateDescending();
    }

}
