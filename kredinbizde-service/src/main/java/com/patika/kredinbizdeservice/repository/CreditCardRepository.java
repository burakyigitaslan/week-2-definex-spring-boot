package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CreditCard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CreditCardRepository {
    private final List<CreditCard> creditCardList = new ArrayList<>();

    public void save(CreditCard creditCard) {
        creditCardList.add(creditCard);
    }

    public List<CreditCard> getAll() {
        return creditCardList;
    }

    public Optional<List<CreditCard>> findByBankName(String bankName) {
        return Optional.of(creditCardList.stream()
                .filter(creditCard -> creditCard.getBank().getName().equals(bankName)).collect(Collectors.toList()));
    }

    public Optional<List<Campaign>> findCampaignsByCreditCardName(String creditCardName) {
        List<Campaign> campaignList = new ArrayList<>();
        for (CreditCard creditCard : creditCardList) {
            if (creditCard.getName().equals(creditCardName) && creditCard.getCampaignList() != null && !creditCard.getCampaignList().isEmpty()) {
                campaignList = creditCard.getCampaignList();
            }
        }
        return Optional.ofNullable(campaignList);
    }

}
