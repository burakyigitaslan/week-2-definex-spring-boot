package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.service.CampaignService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {
    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Campaign create(@RequestBody Campaign campaign) {
        return campaignService.save(campaign);
    }

    @GetMapping
    public List<Campaign> getAll() {
        return campaignService.getAll();
    }

    @GetMapping("/sorted")
    public ResponseEntity<List<Campaign>> getAllCampaignsSortedByCreateDateDescending() {
        List<Campaign> campaigns = campaignService.getAllCampaignsSortedByCreateDateDescending();
        if (!campaigns.isEmpty()) {
            return ResponseEntity.ok().body(campaigns);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
