/**
 * Copyright 2017 Keid
*/
package gof.structural.facade.client;

import gof.structural.facade.facade.PageCreator;

/**
 * Client for Facade pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("-----------------page1-----------------");
        PageCreator.createWelcomePage("eren@example.com");
        System.out.println("---------------------------------------");
        System.out.println("-----------------page2-----------------");
        PageCreator.createWelcomePage("mikasa@example.com");
        System.out.println("---------------------------------------");
        System.out.println("-----------------page3-----------------");
        PageCreator.createWelcomePage("levi@example.com");
        System.out.println("---------------------------------------");
    }

}
