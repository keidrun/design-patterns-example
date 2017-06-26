/**
 * Copyright 2017 Keid
*/
package gof.structural.facade.subsystems;

import java.util.HashMap;
import java.util.Map;

/**
 * Database :Subsystem class
 * 
 * @author Keid
 */
public class Database {

    private static Map<String, String> database = new HashMap<>();

    static {
        database.put("eren@example.com", "Eren Yeager");
        database.put("mikasa@example.com", "Mikasa Ackerman");
        database.put("levi@example.com", "Levi");
    }

    private Database() {
    }

    public static String getValue(String id) {
        return database.get(id);
    }

}
