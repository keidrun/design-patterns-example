/**
 * Copyright 2017 Keid
*/
package gof.builder.client;

import gof.builder.builder.BodyguardBuilder;
import gof.builder.builder.KnightBuilder;
import gof.builder.builder.MillennialBuilder;
import gof.builder.director.HumanDirector;
import gof.builder.product.Human;

/**
 * Client for Builder pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {

        Human human = null;
        HumanDirector director = null;

        // Build bodyguard.
        BodyguardBuilder bodyguardBuilder = new BodyguardBuilder();
        director = new HumanDirector(bodyguardBuilder);
        director.construct("Bob Sapp");
        human = bodyguardBuilder.getResult();
        System.out.println("=== Bodyguard ===");
        System.out.println("The name is " + human.getName());
        System.out.println("The type is " + human.getType());
        human.getWeapon().attack();
        human.getVehicle().saySpeed();

        // Build knight.
        KnightBuilder knightBuilder = new KnightBuilder();
        director = new HumanDirector(knightBuilder);
        director.construct("Kenshin Himura");
        human = knightBuilder.getResult();
        System.out.println("=== Knight ===");
        System.out.println("The name is " + human.getName());
        System.out.println("The type is " + human.getType());
        human.getWeapon().attack();
        human.getVehicle().saySpeed();

        // Build millennial generation.
        MillennialBuilder millennialBuilder = new MillennialBuilder();
        director = new HumanDirector(millennialBuilder);
        director.construct("Justin Bieber");
        human = millennialBuilder.getResult();
        System.out.println("=== Millennial Generation ===");
        System.out.println("The name is " + human.getName());
        System.out.println("The type is " + human.getType());
        human.getWeapon().attack();
        human.getVehicle().saySpeed();

    }

}
