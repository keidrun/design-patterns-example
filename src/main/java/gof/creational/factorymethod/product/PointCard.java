/**
 * Copyright 2017 Keid
*/
package gof.creational.factorymethod.product;

/**
 * PointCard :ConcreteProduct
 * 
 * @author Keid
 */
public class PointCard implements Card {

    private String owner;
    private int points;

    public PointCard(String owner) {
        this.owner = owner;
        this.points = 0;
    }

    @Override
    public void use() {
        System.out.println(owner + " use the point card.");
    }

    @Override
    public String getOwner() {
        return owner;
    }

    public void addPoints(int points) {
        if (points > 0) {
            this.points += points;
        }
    }

    public int getPoints() {
        return points;
    }

    public void usePoint(int amount) {
        if (points <= 0) {
            System.out.println(owner + "'s points is zero.");
        } else if (amount <= points) {
            System.out.println(owner + " use " + amount + " points.");
            System.out.println(
                    owner + "'s points became from " + points + " points to " + (points -= amount) + " points.");
        } else {
            System.out.println(owner + " can't use " + amount + " points, because it is upper than his points.");
        }
    }

}
