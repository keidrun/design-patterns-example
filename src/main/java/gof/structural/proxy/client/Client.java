/**
 * Copyright 2017 Keid
*/
package gof.structural.proxy.client;

import gof.structural.proxy.subject.Displayable;
import gof.structural.proxy.subject.WindowProxy;

/**
 * Client for Proxy pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {

        Displayable window = new WindowProxy("Jobs");
        System.out.println("[name] " + window.getName());
        window.setName("Jonny");
        System.out.println("[name] " + window.getName());
        window.display("Don't worry.");

    }

}
