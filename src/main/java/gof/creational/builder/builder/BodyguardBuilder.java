/**
 * Copyright 2017 Keid
*/
package gof.creational.builder.builder;

import gof.creational.abstractfactory.product.Car;
import gof.creational.abstractfactory.product.Gun;
import gof.creational.abstractfactory.product.Vehicle;
import gof.creational.abstractfactory.product.Weapon;
import gof.creational.builder.product.Human;

/**
 * BodyguardBuilder :ConcreteBuilder
 * 
 * @author Keid
 */
public class BodyguardBuilder implements HumanBuilder {

    private Human human;

    public BodyguardBuilder() {
        human = new Human();
    }

    @Override
    public void buildName(String name) {
        human.setName(name);
    }

    @Override
    public void buildType() {
        human.setType("Bodyguard");
    }

    @Override
    public void buildWeapon() {
        Weapon weapon = new Gun();
        human.setWeapon(weapon);
    }

    @Override
    public void buildVehicle() {
        Vehicle vehicle = new Car(80);
        human.setVehicle(vehicle);
    }

    public Human getResult() {
        return human;
    }

}
