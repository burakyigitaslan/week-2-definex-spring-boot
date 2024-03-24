package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.repository.CreditCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditCardServiceImpl implements CreditCardService{
    private final CreditCardRepository creditCardRepository;

    public CreditCardServiceImpl(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    @Override
    public CreditCard save(CreditCard creditCard) {
        creditCardRepository.save(creditCard);

        return creditCard;
    }

    @Override
    public List<CreditCard> getAll() {
        return creditCardRepository.getAll();
    }

    @Override
    public List<CreditCard> getByBankName(String bankName) {
        Optional<List<CreditCard>> foundCreditCards = creditCardRepository.findByBankName(bankName);

        List<CreditCard> creditCards = null;

        if (foundCreditCards.isPresent()) {
            creditCards = foundCreditCards.get();
        }

        return creditCards;
    }

    @Override
    public List<Campaign> getCampaignsByCreditCardName(String creditCardName){
        Optional<List<Campaign>> foundCampaigns = creditCardRepository.findCampaignsByCreditCardName(creditCardName);

        List<Campaign> campaigns = null;

        if (foundCampaigns.isPresent()) {
            campaigns = foundCampaigns.get();
        }

        return campaigns;
    }
}
