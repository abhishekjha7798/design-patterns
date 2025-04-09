package org.abhishekjha.creational.abstractFactory;

import org.abhishekjha.creational.abstractFactory.creditCard.CardType;
import org.abhishekjha.creational.abstractFactory.creditCard.CreditCard;
import org.abhishekjha.creational.abstractFactory.creditCard.CreditCardFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);

        CreditCard creditCard = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(creditCard.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        creditCard = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(creditCard.getClass());
    }
}
