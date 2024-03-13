package glyph;

import window.Window;

public class Scroller extends Embellishment{
    
    private int scroll_width = 10;

    public Scroller(Compositor compositor, Glyph glyph){
        super(compositor, glyph);
        super.setCompositor(compositor);
        super.getCompositor().setComposition(this); // set the composition for the compositor
    }

    public void draw(Window window){
        super.draw(window);

        Bounds parent_bounds = getbounds();
        Bounds child_bounds = getChild().getbounds();

        window.addScrollBar(child_bounds.getX() + child_bounds.getWidth() + 3,
                             child_bounds.getY(),
                             scroll_width, child_bounds.getHeight()+3);
        
    }
}
