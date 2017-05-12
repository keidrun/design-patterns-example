/**
 * Copyright 2017 Keid
*/
package gof.abstractfactory.product;

/**
 * Gun :ConcreteProduct
 * 
 * @author Keid
 */
public class Gun implements Weapon {

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.product.Weapon#attack()
     */
    @Override
    public void attack() {
        System.out.println("The gun's attach is to shoot!!");
    }

}
