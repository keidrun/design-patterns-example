/**
 * Copyright 2017 Keid
*/
package gof.structural.flyweight.flyweightfactory;

import java.util.HashMap;
import java.util.Map;

import gof.structural.flyweight.flyweight.BigChar;

/**
 * BigCharFactory :FlyWeightFactory
 * 
 * @author Keid
 */
public class BigCharFactory {

    private Map<Character, BigChar> sharedPool = new HashMap<>();

    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char ch) {
        BigChar bigChar = sharedPool.get(ch);
        if (bigChar == null) {
            bigChar = new BigChar(ch);
            sharedPool.put(ch, bigChar);
        }
        return bigChar;
    }

}
