/**
 * Copyright 2017 Keid
*/
package gof.creational.singleton.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * RegistrySingleton :Singleton with registration mechanism
 * 
 * @author Keid
 */
public class RegistrySingleton {

    private static Map<String, RegistrySingleton> registry = new HashMap<>();
    private String name;

    protected RegistrySingleton() {
    }

    public static synchronized RegistrySingleton getInstance(String key) {

        if (registry.containsKey(key)) {
            return registry.get(key);
        } else {
            RegistrySingleton instance = new RegistrySingleton();
            instance.name = key;
            registry.put(key, instance);
            return instance;
        }

    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("This is a registry singleton.");
    }

}
