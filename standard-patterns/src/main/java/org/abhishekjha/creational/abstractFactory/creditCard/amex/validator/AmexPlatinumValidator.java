package org.abhishekjha.creational.abstractFactory.creditCard.amex.validator;

import org.abhishekjha.creational.abstractFactory.creditCard.CreditCard;
import org.abhishekjha.creational.abstractFactory.creditCard.Validator;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}
