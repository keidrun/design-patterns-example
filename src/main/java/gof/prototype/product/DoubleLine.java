/**
 * Copyright 2017 Keid
*/
package gof.prototype.product;

/**
 * StarLine :ConcretePrototype
 * 
 * @author Keid
 */
public class DoubleLine implements Drawing {

    private String symbol;

    public DoubleLine(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void draw(int count) {
        for (int c = 0; c < 2; c++) {
            for (int n = 0; n < count; n++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
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
