/**
 * Copyright 2017 Keid
*/
package gof.structural.facade.facade;

import gof.structural.facade.subsystems.Database;
import gof.structural.facade.subsystems.HtmlPrinter;

/**
 * PageCreator :Facade
 * 
 * @author Keid
 */
public class PageCreator {

    private PageCreator() {
    }

    public static void createWelcomePage(String mailAddress) {
        String name = Database.getValue(mailAddress);
        HtmlPrinter printer = new HtmlPrinter();
        printer.title("Welcome to " + name + "'s page.");
        printer.paragraph("Welcome!! I am " + name + ".");
        printer.paragraph("Contact me.");
        printer.mailto(mailAddress, name);
        printer.close();
    }

}
