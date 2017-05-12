/**
 * Copyright 2017 Keid
*/
package gof.abstractfactory.factory;

import gof.abstractfactory.product.Vehicle;
import gof.abstractfactory.product.Weapon;

/**
 * HumanFactory :AbstractFactory
 * 
 * @author Keid
 */
public abstract class HumanFactory {

    public static HumanFactory getFactory(String className) {
        HumanFactory factory = null;
        try {
            factory = (HumanFactory) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Weapon createWeapon();

    public abstract Vehicle createVehicle();

}
