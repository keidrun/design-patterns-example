/**
 * Copyright 2017 Keid
*/
package gof.creational.factorymethod.product;

/**
 * CreditCard :ConcreteProduct
 * 
 * @author Keid
 */
public class CreditCard implements Card {

    private String owner;
    private int upperLimit;

    public CreditCard(String owner) {
        this.owner = owner;
        this.upperLimit = 0;
    }

    @Override
    public void use() {
        System.out.println(owner + " use the credit card.");
    }

    @Override
    public String getOwner() {
        return owner;
    }

    public void chengeLimit(int upperLimit) {
        if (upperLimit > 0) {
            this.upperLimit = upperLimit;
        }
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public void cashAdvance(int amount) {
        if (upperLimit <= 0) {
            System.out.println(owner + " can't get any cash.");
        } else if (amount <= upperLimit) {
            System.out.println(owner + " get $" + amount);
        } else {
            System.out.println(owner + " can't get $" + amount + ", because it is upper than his limit.");
        }
    }

}
