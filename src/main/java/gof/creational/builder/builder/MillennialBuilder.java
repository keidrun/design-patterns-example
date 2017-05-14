/**
 * Copyright 2017 Keid
*/
package gof.creational.builder.builder;

import gof.creational.abstractfactory.product.IPhone;
import gof.creational.abstractfactory.product.Segway;
import gof.creational.abstractfactory.product.Vehicle;
import gof.creational.abstractfactory.product.Weapon;
import gof.creational.builder.product.Human;

/**
 * MillennialBuilder :ConcreteBuilder
 * 
 * @author Keid
 */
public class MillennialBuilder implements HumanBuilder {

    private Human human;

    public MillennialBuilder() {
        human = new Human();
    }

    @Override
    public void buildName(String name) {
        human.setName(name);
    }

    @Override
    public void buildType() {
        human.setType("Millennial generation");
    }

    @Override
    public void buildWeapon() {
        Weapon weapon = new IPhone();
        human.setWeapon(weapon);
    }

    @Override
    public void buildVehicle() {
        Vehicle vehicle = new Segway(10);
        human.setVehicle(vehicle);
    }

    public Human getResult() {
        return human;
    }

}
