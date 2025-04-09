package org.abhishekjha.creational.abstractFactory.creditCard.amex;

import org.abhishekjha.creational.abstractFactory.creditCard.CardType;
import org.abhishekjha.creational.abstractFactory.creditCard.CreditCard;
import org.abhishekjha.creational.abstractFactory.creditCard.CreditCardFactory;
import org.abhishekjha.creational.abstractFactory.creditCard.Validator;
import org.abhishekjha.creational.abstractFactory.creditCard.amex.validator.AmexGoldValidator;
import org.abhishekjha.creational.abstractFactory.creditCard.amex.validator.AmexPlatinumValidator;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        return switch (cardType) {
            case GOLD -> new AmexGold();
            case PLATINUM -> new AmexPlatinum();
        };
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return switch (cardType) {
            case GOLD -> new AmexGoldValidator();
            case PLATINUM -> new AmexPlatinumValidator();
        };
    }
}
