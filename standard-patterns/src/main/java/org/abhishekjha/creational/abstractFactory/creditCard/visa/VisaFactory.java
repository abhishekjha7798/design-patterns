package org.abhishekjha.creational.abstractFactory.creditCard.visa;

import org.abhishekjha.creational.abstractFactory.creditCard.CardType;
import org.abhishekjha.creational.abstractFactory.creditCard.CreditCard;
import org.abhishekjha.creational.abstractFactory.creditCard.CreditCardFactory;
import org.abhishekjha.creational.abstractFactory.creditCard.Validator;
import org.abhishekjha.creational.abstractFactory.creditCard.visa.validator.VisaBlackValidator;
import org.abhishekjha.creational.abstractFactory.creditCard.visa.validator.VisaGoldValidator;

public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        return switch (cardType) {
            case GOLD -> new VisaGold();
            case PLATINUM -> new VisaBlack();
        };
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return switch (cardType) {
            case GOLD -> new VisaGoldValidator();
            case PLATINUM -> new VisaBlackValidator();
        };
    }
}
