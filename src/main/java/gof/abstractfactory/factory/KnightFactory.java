/**
 * Copyright 2017 Keid
*/
package gof.abstractfactory.factory;

import gof.abstractfactory.product.Horse;
import gof.abstractfactory.product.Sword;
import gof.abstractfactory.product.Vehicle;
import gof.abstractfactory.product.Weapon;

/**
 * KnightFactory :ConcreteFactory
 * 
 * @author Keid
 */
public class KnightFactory extends HumanFactory {

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.factory.HumanFactory#createWeapon()
     */
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    /*
     * (non-Javadoc)
     * 
     * @see gof.abstractfactory.factory.HumanFactory#createVehicle()
     */
    @Override
    public Vehicle createVehicle() {
        return new Horse(30);
    }

}
