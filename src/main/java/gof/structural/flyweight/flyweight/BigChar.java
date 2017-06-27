/**
 * Copyright 2017 Keid
*/
package gof.structural.flyweight.flyweight;

/**
 * BigChar :Flyweight
 * 
 * @author Keid
 */
public class BigChar {

    // intrinsic
    private String bigChar;

    public BigChar(char ch) {
        this.bigChar = BigFontStore.getBigFont(ch);
    }

    public void print() {
        System.out.println(bigChar);
    }

}
