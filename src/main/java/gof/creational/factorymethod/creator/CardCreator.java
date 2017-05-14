/**
 * Copyright 2017 Keid
*/
package gof.creational.factorymethod.creator;

import gof.creational.factorymethod.product.Card;

/**
 * CardCreator :Creator
 * 
 * @author Keid
 */
public abstract class CardCreator {

    // factory method
    public final Card create(CardType type, String owner) {
        Card card = createCard(type, owner);
        registerCard(card);
        return card;
    }

    protected abstract Card createCard(CardType type, String owner);

    protected abstract void registerCard(Card card);

}
