
import window.*;
import glyph.*;
import glyph.Character; // has to be manually imported for some reason?

public class main {
    public static void main(String[] args) {
        // hw1_test();
        long_rows();
    }

    public static void hw1_test() {
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

    public static void simpborder(){
        Window window = new SwingWindow("Lexi 0");
        SimpleCompositor simcom1 = new SimpleCompositor(window);
        SimpleCompositor simcom2 = new SimpleCompositor(window);

        Row row1 = new Row(simcom1);
        Border border1 = new Border(simcom2, row1, 2);

        Glyph X = new Character('X');
        Glyph Y = new Character('Y');
        Glyph Z = new Character('Z');

        try {
            border1.addChild(X, 0);
            border1.addChild(Y, 1);
            border1.addChild(Z, 2);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        window.setContents(border1);
    }

    public static void hw2_test(){
        Window window = new SwingWindow("Lexi 0");
        SimpleCompositor simcom1 = new SimpleCompositor(window);
        SimpleCompositor simcom2 = new SimpleCompositor(window);
        SimpleCompositor simcom3 = new SimpleCompositor(window);
        SimpleCompositor simcom4 = new SimpleCompositor(window);
        SimpleCompositor simcom5 = new SimpleCompositor(window); // HW2
        SimpleCompositor simcom6 = new SimpleCompositor(window); // HW2
        SimpleCompositor simcom7 = new SimpleCompositor(window); // HW2
        SimpleCompositor simcom8 = new SimpleCompositor(window); // HW2
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

    public static void fancy_constructor_test(){
        Window window = new SwingWindow("Lexi 0");
        SimpleCompositor simcom1 = new SimpleCompositor(window);
        
        Row row1 = new Row("this is a", simcom1);

        try {

            // border1.addChild(col2, 0);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        window.setContents(row1);
    }

    public static void long_rows(){
        Window window = new SwingWindow("Lexi 0");
        SimpleCompositor simcom1 = new SimpleCompositor(window);
        SimpleCompositor simcom2 = new SimpleCompositor(window);
        SimpleCompositor simcom3 = new SimpleCompositor(window);
        SimpleCompositor simcom4 = new SimpleCompositor(window);
        // create a character for each letter inside "this is a border demonstration. Scroller too!"
        Row row1 = new Row(simcom1);
        Row row2 = new Row(simcom2);
        Row row3 = new Row(simcom3);  
        Column col1 = new Column(simcom4);

        try {
            row1.addChild(new Character('T'), 0);
            row1.addChild(new Character('h'), 1);
            row1.addChild(new Character('i'), 2);
            row1.addChild(new Character('s'), 3);
            row1.addChild(new Character(' '), 4);
            row1.addChild(new Character('i'), 5);
            row1.addChild(new Character('s'), 6);
            row1.addChild(new Character(' '), 7);
            row1.addChild(new Character('a'), 8);

            row2.addChild(new Character('b'), 0);
            row2.addChild(new Character('o'), 1);
            row2.addChild(new Character('r'), 2);
            row2.addChild(new Character('d'), 3);
            row2.addChild(new Character('e'), 4);
            row2.addChild(new Character('r'), 5);
            row2.addChild(new Character(' '), 6);
            row2.addChild(new Character('d'), 7);
            row2.addChild(new Character('e'), 8);
            row2.addChild(new Character('m'), 9);
            row2.addChild(new Character('o'), 10);
            row2.addChild(new Character('n'), 11);
            row2.addChild(new Character('s'), 12);
            row2.addChild(new Character('t'), 13);
            row2.addChild(new Character('r'), 14);
            row2.addChild(new Character('a'), 15);
            row2.addChild(new Character('t'), 16);
            row2.addChild(new Character('i'), 17);
            row2.addChild(new Character('o'), 18);
            row2.addChild(new Character('n'), 19);
            row2.addChild(new Character('.'), 20);

            row3.addChild(new Character('S'), 0);
            row3.addChild(new Character('c'), 1);
            row3.addChild(new Character('r'), 2);
            row3.addChild(new Character('o'), 3);
            row3.addChild(new Character('l'), 4);
            row3.addChild(new Character('l'), 5);
            row3.addChild(new Character('e'), 6);
            row3.addChild(new Character('r'), 7);
            row3.addChild(new Character(' '), 8);
            row3.addChild(new Character('t'), 9);
            row3.addChild(new Character('o'), 10);
            row3.addChild(new Character('o'), 11);
            row3.addChild(new Character('!'), 12);
            
            col1.addChild(row1, 0);
            col1.addChild(row2, 1);
            col1.addChild(row3, 2);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        window.setContents(col1);
    }
}
