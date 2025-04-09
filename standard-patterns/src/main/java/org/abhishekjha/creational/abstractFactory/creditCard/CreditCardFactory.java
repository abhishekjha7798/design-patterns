package org.abhishekjha.creational.abstractFactory.creditCard;

import org.abhishekjha.creational.abstractFactory.creditCard.amex.AmexFactory;
import org.abhishekjha.creational.abstractFactory.creditCard.visa.VisaFactory;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new VisaFactory();
        } else {
            return new AmexFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);
    public abstract Validator getValidator(CardType cardType);
}
