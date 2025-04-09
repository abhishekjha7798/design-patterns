package org.abhishekjha.creational.abstractFactory.creditCard.visa.validator;

import org.abhishekjha.creational.abstractFactory.creditCard.CreditCard;
import org.abhishekjha.creational.abstractFactory.creditCard.Validator;

public class VisaGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
