/**
 * Copyright 2017 Keid
*/
package gof.structural.composite.client;

import gof.structural.composite.composite.Directory;
import gof.structural.composite.leaf.File;

/**
 * Client for Composite pattern.
 * 
 * @author Keid
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("Making root directories...");
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        root.add(bin);
        bin.add(new File("curl", 500));
        bin.add(new File("brew", 2000));
        root.add(tmp);
        root.printLine();
        System.out.println();

        System.out.println("Making home directories...");
        Directory home = new Directory("home");
        root.add(home);
        Directory userA = new Directory("tombrown");
        Directory desktopA = new Directory("Desktop");
        Directory documentA = new Directory("Document");
        Directory userB = new Directory("kentanaka");
        Directory desktopB = new Directory("Desktop");
        Directory documentB = new Directory("Document");
        home.add(userA);
        userA.add(desktopA);
        userA.add(documentA);
        desktopA.add(new File("hello.txt", 10));
        documentA.add(new File("world.txt", 30));
        home.add(userB);
        userB.add(desktopB);
        userB.add(documentB);
        documentB.add(new File("hello world.txt", 40));
        documentB.add(new File("sicret.txt", 100));
        root.printLine();
    }

}
