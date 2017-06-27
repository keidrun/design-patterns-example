/**
 * Copyright 2017 Keid
*/
package gof.structural.flyweight.flyweight;

import gof.structural.flyweight.flyweightfactory.BigCharFactory;

/**
 * BigString
 * 
 * @author Keid
 */
public class BigString {

    private BigChar[] bigChars;

    public BigString(String str) {
        bigChars = new BigChar[str.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < str.length(); i++) {
            bigChars[i] = factory.getBigChar(str.charAt(i));
        }
    }

    public void print() {
        for (BigChar ch : bigChars) {
            ch.print();
        }
    }

}
