/**
 * Copyright 2017 Keid
*/
package gof.builder.product;

import gof.abstractfactory.product.Vehicle;
import gof.abstractfactory.product.Weapon;

/**
 * Human :Product
 * 
 * @author Keid
 */
public class Human {

    private String name;
    private String type;
    private Weapon weapon;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
