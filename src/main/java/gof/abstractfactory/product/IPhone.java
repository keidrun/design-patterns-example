/**
 * Copyright 2017 Keid
*/
package gof.abstractfactory.product;

/**
 * IPhone :ConcreteProduct
 * 
 * @author Keid
 */
public class IPhone implements Weapon {

    @Override
    public void attack() {
        System.out.println("The iPhone's attach is trolling!!");
    }

}
