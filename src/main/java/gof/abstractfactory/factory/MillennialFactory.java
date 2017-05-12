/**
 * Copyright 2017 Keid
*/
package gof.abstractfactory.factory;

import gof.abstractfactory.product.IPhone;
import gof.abstractfactory.product.Segway;
import gof.abstractfactory.product.Vehicle;
import gof.abstractfactory.product.Weapon;

/**
 * MillennialFactory :ConcreteFactory
 * 
 * @author Keid
 */
public class MillennialFactory extends HumanFactory {

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.factory.HumanFactory#createWeapon()
     */
    @Override
    public Weapon createWeapon() {
        return new IPhone();
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.factory.HumanFactory#createVehicle()
     */
    @Override
    public Vehicle createVehicle() {
        return new Segway(10);
    }

}
