/**
 * Copyright 2017 Keid
*/
package gof.factorymethod.creator;

import java.util.ArrayList;
import java.util.List;

import gof.factorymethod.product.Card;
import gof.factorymethod.product.CashCard;
import gof.factorymethod.product.CreditCard;

/**
 * BankCardCreator :ConcreteCreator
 * 
 * @author Keid
 */
public class BankCardCreator extends CardCreator {

    private List<Card> registeredCards = new ArrayList<Card>();

    @Override
    protected Card createCard(CardType type, String owner) {
        switch (type) {
        case CASH:
            return new CashCard(owner);
        case CREDIT:
            return new CreditCard(owner);
        default:
            return new CashCard(owner);
        }
    }

    @Override
    protected void registerCard(Card card) {
        registeredCards.add(card);
    }

    public List<Card> getRegisteredCards() {
        return registeredCards;
    }

}
