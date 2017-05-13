/**
 * Copyright 2017 Keid
*/
package gof.factorymethod.creator;

import java.util.ArrayList;
import java.util.List;

import gof.factorymethod.product.Card;
import gof.factorymethod.product.PointCard;

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
