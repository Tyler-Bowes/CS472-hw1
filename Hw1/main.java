
import window.*;
import glyph.*;
import glyph.Character;

public class main {
    public static void main(String[] args) {
	Window window0=new SwingWindow("Lexi 0");
    Glyph rect1 = new Rectangle(20, 10);
    rect1.draw(window0);
    // Glyph a = new Character('a');
    window0.setContents(rect1);
    }
}
