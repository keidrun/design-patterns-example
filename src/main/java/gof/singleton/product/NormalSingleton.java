/**
 * Copyright 2017 Keid
*/
package gof.singleton.product;

/**
 * NormalSingleton :Singleton
 * 
 * @author Keid
 */
public class NormalSingleton {

    private static NormalSingleton singleton = new NormalSingleton();

    private NormalSingleton() {
    }

    public static NormalSingleton getInstance() {
        return singleton;
    }

    public void display() {
        System.out.println("This is a singleton!");
    }

}
