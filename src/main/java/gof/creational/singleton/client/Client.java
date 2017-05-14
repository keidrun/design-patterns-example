/**
 * Copyright 2017 Keid
*/
package gof.creational.singleton.client;

import gof.creational.singleton.singleton.NormalSingleton;
import gof.creational.singleton.singleton.RegistrySingleton;

/**
 * Client for Singleton pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {

        NormalSingleton obj1 = NormalSingleton.getInstance();
        NormalSingleton obj2 = NormalSingleton.getInstance();
        if (obj1 == obj2) {
            obj1.display();
        }

        RegistrySingleton obj3 = RegistrySingleton.getInstance("One");
        RegistrySingleton obj4 = RegistrySingleton.getInstance("One");
        RegistrySingleton obj5 = RegistrySingleton.getInstance("Two");
        RegistrySingleton obj6 = RegistrySingleton.getInstance("Two");
        System.out.println("Compare " + obj3.getName() + " to " + obj4.getName() + ".");
        if (obj3 == obj4) {
            obj3.display();
        } else {
            System.out.println("Not equal.");
        }
        System.out.println("Compare " + obj4.getName() + " to " + obj5.getName() + ".");
        if (obj3 == obj5) {
            obj3.display();
        } else {
            System.out.println("Not equal.");
        }
        System.out.println("Compare " + obj5.getName() + " to " + obj6.getName() + ".");
        if (obj5 == obj6) {
            obj5.display();
        } else {
            System.out.println("Not equal.");
        }

    }

}
