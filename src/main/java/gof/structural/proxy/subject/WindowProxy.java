/**
 * Copyright 2017 Keid
*/
package gof.structural.proxy.subject;

/**
 * WindowProxy :Proxy
 * 
 * @author Keid
 */
public class WindowProxy implements Displayable {

    private String name;
    private Window realWindow;

    public WindowProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setName(String name) {
        if (realWindow != null) {
            this.realWindow.setName(name);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void display(String message) {
        realize();
        realWindow.display(message);
    }

    private synchronized void realize() {
        if (realWindow == null) {
            this.realWindow = new Window(this.name);
        }
    }

}
