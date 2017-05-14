/**
 * Copyright 2017 Keid
*/
package gof.creational.abstractfactory.product;

/**
 * Sword :ConcreteProduct
 * 
 * @author Keid
 */
public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("The sword's attach is to cut!!");
    }

}
