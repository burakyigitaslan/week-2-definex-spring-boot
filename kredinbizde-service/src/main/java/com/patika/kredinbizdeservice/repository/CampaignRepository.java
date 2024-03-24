package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Campaign;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CampaignRepository {
    private final List<Campaign> campaignList = new ArrayList<>();

    public void save(Campaign campaign) {
        campaignList.add(campaign);
    }

    public List<Campaign> getAll() {
        return campaignList;
    }

    public List<Campaign> getAllCampaignsSortedByCreateDateDescending() {
        return campaignList.stream().sorted(Comparator.comparing(Campaign::getCreateDate).reversed()).collect(Collectors.toList());
    }
}
