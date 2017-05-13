/**
 * Copyright 2017 Keid
*/
package gof.prototype.manager;

import java.util.HashMap;
import java.util.Map;

import gof.prototype.product.Drawing;

/**
 * DrawingTool :Client
 * 
 * @author Keid
 */
public class DrawingTool {

    private Map<String, Drawing> drawings = new HashMap<>();

    public void register(String name, Drawing drawing) {
        this.drawings.put(name, drawing);
    }

    public Drawing create(String name) {
        Drawing drawing = drawings.get(name);
        return drawing.clone();
    }

}
