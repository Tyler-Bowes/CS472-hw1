
import window.*;
import glyph.*;
import glyph.Character; // has to be manually imported for some reason?

public class main {
    public static void main(String[] args) {
	/* Test with just a row */
    // Window window = new SwingWindow("Lexi 0");
    // SimpleCompositor simcom = new SimpleCompositor(window);
    // Row row1 = new Row(simcom);
    // Glyph a = new Character('a');
    // Glyph X = new Character('X');
    // Glyph b = new Character('b');
    // Glyph rect1 = new Rectangle(10, 20);
    
    // try {
    //     row1.addChild(a, 0);
    //     row1.addChild(rect1, 1);
    //     row1.addChild(X, 2);
    //     row1.addChild(b, 3);
    // } catch (UnsupportedOperationException e) {
    //     e.printStackTrace();
    // }
    // window.setContents(row1);

    Window window = new SwingWindow("Lexi 0");
    SimpleCompositor simcom1 = new SimpleCompositor(window);
    SimpleCompositor simcom2 = new SimpleCompositor(window);
    SimpleCompositor simcom3 = new SimpleCompositor(window);
    SimpleCompositor simcom4 = new SimpleCompositor(window);
    Row row1 = new Row(simcom1);
    Row row2 = new Row(simcom2);
    Column col1 = new Column(simcom3);
    Column col2 = new Column(simcom4);

    Glyph X = new Character('X');
    Glyph Y = new Character('Y');
    Glyph Z = new Character('Z');
    

    Glyph a = new Character('a');
    Glyph b = new Character('b');
    Glyph rect1 = new Rectangle(10, 20);
    

    Glyph x = new Character('x');
    Glyph rect2 = new Rectangle(20, 10);
    Glyph y = new Character('y');
    

    try {
        col1.addChild(X, 0);
        col1.addChild(Y, 1);
        col1.addChild(Z, 2);

        row1.addChild(a, 0);
        row1.addChild(rect1, 1);
        row1.addChild(col1, 2);
        row1.addChild(b, 3);

        row2.addChild(x, 0);
        row2.addChild(rect2, 1);
        row2.addChild(y, 2);

        col2.addChild(row1, 0);
        col2.addChild(row2, 1);
    } catch (UnsupportedOperationException e) {
        e.printStackTrace();
    }

    window.setContents(col2);
    }

}
