/**
 * Copyright 2017 Keid
*/
package gof.abstractfactory.product;

/**
 * Sword :ConcreteProduct
 * 
 * @author Keid
 */
public class Sword implements Weapon {

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.product.Weapon#attack()
     */
    @Override
    public void attack() {
        System.out.println("The sword's attach is to cut!!");
    }

}