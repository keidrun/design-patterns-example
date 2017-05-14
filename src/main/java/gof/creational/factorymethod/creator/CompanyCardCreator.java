/**
 * Copyright 2017 Keid
*/
package gof.creational.factorymethod.creator;

import java.util.ArrayList;
import java.util.List;

import gof.creational.factorymethod.product.Card;
import gof.creational.factorymethod.product.PointCard;

/**
 * CompanyCardCreator :ConcreteCreator
 * 
 * @author Keid
 */
public class CompanyCardCreator extends CardCreator {

    private List<Card> registeredCards = new ArrayList<Card>();

    @Override
    protected Card createCard(CardType type, String owner) {
        switch (type) {
        case POINT:
            return new PointCard(owner);
        default:
            return new PointCard(owner);
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
