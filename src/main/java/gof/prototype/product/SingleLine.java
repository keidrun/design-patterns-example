/**
 * Copyright 2017 Keid
*/
package gof.prototype.product;

/**
 * SingleLine :ConcretePrototype
 * 
 * @author Keid
 */
public class SingleLine implements Drawing {

    private String symbol;

    public SingleLine(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void draw(int count) {
        for (int n = 0; n < count; n++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    @Override
    public Drawing clone() {
        Drawing drawing = null;
        try {
            drawing = (Drawing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
        return drawing;
    }

}
