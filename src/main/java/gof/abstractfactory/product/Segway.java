/**
 * Copyright 2017 Keid
*/
package gof.abstractfactory.product;

/**
 * Segway :ConcreteProduct
 * 
 * @author Keid
 */
public class Segway extends Vehicle {

    public Segway(int kilometerPerHour) {
        super.kilometerPerHour = kilometerPerHour;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.product.Vehicle#saySpeed()
     */
    @Override
    public void saySpeed() {
        System.out.println("The segway's speed is about " + kilometerPerHour + " km/h.");
    }

}
