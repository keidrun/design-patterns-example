/**
 * Copyright 2017 Keid
*/
package gof.abstractfactory.product;

/**
 * Horse :ConcreteProduct
 * 
 * @author Keid
 */
public class Horse extends Vehicle {

    public Horse(int kilometerPerHour) {
        super.kilometerPerHour = kilometerPerHour;
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.product.Vehicle#saySpeed()
     */
    @Override
    public void saySpeed() {
        System.out.println("The horse's speed is about " + kilometerPerHour + " km/h.");
    }

}
