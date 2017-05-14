/**
 * Copyright 2017 Keid
*/
package gof.creational.prototype.client;

import gof.creational.prototype.manager.DrawingTool;
import gof.creational.prototype.product.DoubleLine;
import gof.creational.prototype.product.Drawing;
import gof.creational.prototype.product.SingleLine;

/**
 * Client for Prototype pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {

        // register
        DrawingTool manager = new DrawingTool();
        Drawing line1 = new SingleLine("-");
        Drawing line2 = new SingleLine("=");
        Drawing line3 = new DoubleLine("*");
        manager.register("single hyphen", line1);
        manager.register("single equal", line2);
        manager.register("double star", line3);

        // create
        Drawing drawing1 = manager.create("single hyphen");
        drawing1.draw(10);
        Drawing drawing2 = manager.create("single equal");
        drawing2.draw(20);
        Drawing drawing3 = manager.create("double star");
        drawing3.draw(30);

    }

}
