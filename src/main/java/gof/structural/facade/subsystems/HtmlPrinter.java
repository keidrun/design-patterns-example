/**
 * Copyright 2017 Keid
*/
package gof.structural.facade.subsystems;

/**
 * HtmlPrinter :Subsystem class
 * 
 * @author Keid
 */
public class HtmlPrinter {

    private StringBuffer html;

    public HtmlPrinter() {
        this.html = new StringBuffer();
    }

    public void title(String title) {
        this.html.append("<html>\n");
        this.html.append("<head>\n");
        this.html.append("<title>" + title + "</title>\n");
        this.html.append("</head>\n");
        this.html.append("<body>\n");
        this.html.append("<h1>" + title + "</h1>\n");
    }

    public void paragraph(String message) {
        this.html.append("<p>" + message + "</p>\n");
    }

    public void link(String href, String caption) {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailAddress, String name) {
        link("mailto:" + mailAddress, name);
    }

    public void close() {
        this.html.append("</body>\n");
        this.html.append("</html>");
        System.out.println(this.html.toString());
    }

}
