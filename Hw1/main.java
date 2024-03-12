
import window.*;
import glyph.*;
import glyph.Character; // has to be manually imported for some reason?

public class main {
    public static void main(String[] args) {
        hw1_test();
    }

    public static void hw1_test() {
        Window window = new SwingWindow("Lexi 0");
        SimpleCompositor simcom1 = new SimpleCompositor(window);
        SimpleCompositor simcom2 = new SimpleCompositor(window);
        SimpleCompositor simcom3 = new SimpleCompositor(window);
        SimpleCompositor simcom4 = new SimpleCompositor(window);
        // SimpleCompositor simcom5 = new SimpleCompositor(window); // HW2
        // Border border1 = new Border(simcom5, border1, 2);  // HW2
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
            // border1.addChild(col2, 0);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        window.setContents(col2);
    }

    public static void test2(){
        Window window = new SwingWindow("Lexi 0");
        SimpleCompositor simcom1 = new SimpleCompositor(window);
        SimpleCompositor simcom2 = new SimpleCompositor(window);
        SimpleCompositor simcom3 = new SimpleCompositor(window);
        SimpleCompositor simcom4 = new SimpleCompositor(window);
        SimpleCompositor simcom5 = new SimpleCompositor(window); // HW2
        Row row1 = new Row(simcom1);
        Row row2 = new Row(simcom2);
        Column col1 = new Column(simcom3);
        Column col2 = new Column(simcom4);
        Border border1 = new Border(simcom5, row1, 2);  // HW2

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

            border1.addChild(a, 0);
            border1.addChild(rect1, 1);
            border1.addChild(col1, 2);
            border1.addChild(b, 3);

            row2.addChild(x, 0);
            row2.addChild(rect2, 1);
            row2.addChild(y, 2);

            col2.addChild(border1, 0);
            col2.addChild(row2, 1);
            // border1.addChild(col2, 0);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        window.setContents(col2);
    }

}
