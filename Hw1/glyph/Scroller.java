package glyph;

import window.Window;

public class Scroller extends Embellishment{
    
    public Scroller(Compositor compositor){
        setCompositor(compositor);
        getCompositor().setComposition(this); // set the composition for the compositor
    }

    public void draw(Window window){
        // temporary
        super.draw(window);
        // do something to add scrollbars
        
    }
}
