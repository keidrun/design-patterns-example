/**
 * Copyright 2017 Keid
*/
package gof.creational.factorymethod.product;

/**
 * CashCard :ConcreteProduct
 * 
 * @author Keid
 */
public class CashCard implements Card {

    private String owner;
    private int balance;

    public CashCard(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    @Override
    public void use() {
        System.out.println(owner + " use the cash card.");
    }

    @Override
    public String getOwner() {
        return owner;
    }

    public void addBalance(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void drawBalance(int amount) {
        if (balance <= 0) {
            System.out.println(owner + "'s balance is zero.");
        } else if (amount <= balance) {
            System.out.println(owner + " draw $" + amount);
            System.out.println(owner + "'s balance became from $" + balance + " to $" + (balance -= amount) + ".");
        } else {
            System.out.println(owner + " can't draw $" + amount + ", because it is upper than his balance.");
        }
    }

}
