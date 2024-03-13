package glyph;

import java.util.ArrayList;

import window.Window;

public class Border extends Embellishment{
    
    private int border_width;

    public Border(Compositor compositor, Glyph glyph, int border_width){
        super(compositor, glyph);
        this.border_width = border_width;
        getbounds().setBounds(border_width, border_width, 0, 0);
        // super.setChildren(new ArrayList<>());
        super.setCompositor(compositor);
        super.getCompositor().setComposition(this); // set the composition for the compositor
    }

    public void draw(Window window){
        super.draw(window);
        
        window.addBorder(getChild().getbounds().getX(), getChild().getbounds().getY(), 
                         getChild().getbounds().getX() + getChild().getbounds().getWidth() + 3,
                         getChild().getbounds().getY() + getChild().getbounds().getHeight() + 3,
                         border_width);
    }

    // public setPosition

    // public

    // // set position x + size, y + size

    // adjustBounds

}
