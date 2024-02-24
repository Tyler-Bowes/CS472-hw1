
import window.*;
import glyph.*;
import glyph.Character; // has to be manually imported for some reason?

public class main {
    public static void main(String[] args) {
	Window window = new SwingWindow("Lexi 0");
    SimpleCompositor simcom = new SimpleCompositor(window);
    Row row1 = new Row(simcom);
    Glyph a = new Character('a');
    Glyph b = new Character('b');
    Glyph c = new Character('c');
    Glyph rect1 = new Rectangle(10, 20);
    
    try {
        row1.addChild(a, 0);
        row1.addChild(rect1, 1);
        row1.addChild(b, 2);
        row1.addChild(c, 3);
    } catch (UnsupportedOperationException e) {
        e.printStackTrace();
    }

    window.setContents(row1);
    }
}
