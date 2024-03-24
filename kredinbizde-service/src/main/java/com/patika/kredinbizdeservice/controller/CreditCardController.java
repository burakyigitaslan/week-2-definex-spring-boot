package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.service.CreditCardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credit-cards")
public class CreditCardController {
    private final CreditCardService creditCardService;

    public CreditCardController(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreditCard create(@RequestBody CreditCard creditCard) {
        return creditCardService.save(creditCard);
    }

    @GetMapping
    public List<CreditCard> getAll() {
        return creditCardService.getAll();
    }

    @GetMapping("/{bankName}")
    public ResponseEntity<List<CreditCard>> getByBankName(@PathVariable String bankName) {
        List<CreditCard> creditCards = creditCardService.getByBankName(bankName);
        if (!creditCards.isEmpty()) {
            return ResponseEntity.ok().body(creditCards);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{creditCardName}/campaigns")
    public ResponseEntity<List<Campaign>> getCampaignsByCreditCardName(@PathVariable String creditCardName) {
        List<Campaign> campaigns = creditCardService.getCampaignsByCreditCardName(creditCardName);
        if (!campaigns.isEmpty()) {
            return ResponseEntity.ok().body(campaigns);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
