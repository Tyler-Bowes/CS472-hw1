package glyph;

import java.util.ArrayList;

import window.Window;

public class Scroller extends Embellishment{
    
    private int scroll_width = 10;

    public Scroller(Compositor compositor, Glyph glyph){
        super(compositor, glyph);
        super.setChildren(new ArrayList<>());
        super.setCompositor(compositor);
        super.getCompositor().setComposition(this); // set the composition for the compositor
    }

    public void draw(Window window){
        super.draw(window);

        window.addScrollBar(getChild().getbounds().getX() + getChild().getbounds().getWidth() + 3, getChild().getbounds().getY(),
                            scroll_width, getChild().getbounds().getHeight()+3);
        
    }
}
