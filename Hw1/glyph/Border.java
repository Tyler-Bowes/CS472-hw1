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
        
        Bounds parent_bounds = getbounds();
        Bounds child_bounds = getChild().getbounds();

        // used hard coded values to make border look nice
        window.addBorder(parent_bounds.getX() - 2, parent_bounds.getY() - 1, 
                         child_bounds.getX() + child_bounds.getWidth() + 3,
                         child_bounds.getY() + child_bounds.getHeight() + 3,
                         border_width);
    }

    @Override
    public void adjustBounds(Bounds cursor) {
        // super.adjustBounds(cursor);
        
        // System.out.println("Adjust: " + getbounds().getX() + " " + getbounds().getY() + " " + getbounds().getWidth() + " " + getbounds().getHeight());
        // getbounds().setBounds(getbounds().getX(),
        //  getbounds().getY(), 
        //  getbounds().getWidth() + cursor.getWidth(), 
        //  getbounds().getHeight() + cursor.getHeight());
    }



    // public setPosition

    // public void setPosition(Bounds cursor) {
    //     getbounds().setBounds(cursor.getX(), cursor.getY(), getbounds().getWidth(), getbounds().getHeight());
    // }

    // public

    // // set position x + size, y + size

    // adjustBounds

}
