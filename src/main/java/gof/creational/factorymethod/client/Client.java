/**
 * Copyright 2017 Keid
*/
package gof.creational.factorymethod.client;

import gof.creational.factorymethod.creator.BankCardCreator;
import gof.creational.factorymethod.creator.CardCreator;
import gof.creational.factorymethod.creator.CardType;
import gof.creational.factorymethod.creator.CompanyCardCreator;
import gof.creational.factorymethod.product.Card;
import gof.creational.factorymethod.product.CashCard;
import gof.creational.factorymethod.product.CreditCard;
import gof.creational.factorymethod.product.PointCard;

/**
 * Client for FactoryMethod pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {

        CardCreator bankCardCreator = new BankCardCreator();
        Card cashCard1 = bankCardCreator.create(CardType.CASH, "Jon");
        Card cashCard2 = bankCardCreator.create(CardType.CASH, "Tom");
        Card creditCard1 = bankCardCreator.create(CardType.CREDIT, "Mary");
        Card creditCard2 = bankCardCreator.create(CardType.CREDIT, "Kate");
        System.out.println("=== Bank's Registerd Owners ===");
        for (Card c : ((BankCardCreator) bankCardCreator).getRegisteredCards()) {
            System.out.println(c.getOwner());
        }
        System.out.println("=== Action in a bank ===");
        cashCard1.use();
        ((CashCard)cashCard1).addBalance(100000);
        ((CashCard)cashCard1).drawBalance(1000);
        ((CashCard)cashCard1).drawBalance(200000);
        System.out.println(((CashCard)cashCard1).getBalance());
        cashCard2.use();
        ((CashCard)cashCard2).addBalance(0);
        ((CashCard)cashCard2).drawBalance(2000);
        creditCard1.use();
        ((CreditCard)creditCard1).chengeLimit(500000);
        ((CreditCard)creditCard1).cashAdvance(3000);
        ((CreditCard)creditCard1).cashAdvance(1000000);
        creditCard2.use();
        ((CreditCard)creditCard2).chengeLimit(0);
        ((CreditCard)creditCard2).cashAdvance(5000);

        CardCreator companyCardCreator = new CompanyCardCreator();
        Card pointCard1 = companyCardCreator.create(CardType.POINT, "Ken");
        Card pointCard2 = companyCardCreator.create(CardType.POINT, "Hana");
        System.out.println("=== Company's Registerd Owners ===");
        for (Card c : ((CompanyCardCreator) companyCardCreator).getRegisteredCards()) {
            System.out.println(c.getOwner());
        }
        System.out.println("=== Action on a company's web site ===");
        pointCard1.use();
        ((PointCard)pointCard1).addPoints(500);
        ((PointCard)pointCard1).usePoint(100);
        ((PointCard)pointCard1).usePoint(1000);
        pointCard2.use();
        ((PointCard)pointCard2).addPoints(0);
        ((PointCard)pointCard2).usePoint(200);

    }

}
