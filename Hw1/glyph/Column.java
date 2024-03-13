package glyph;

import window.Window;

// composite
public class Column extends Composition {

    public Column(SimpleCompositor compositor){
        super(compositor); // Call the superclass constructor
    }

    public void moveBounds(Bounds cursor, Glyph child) {
        Bounds child_bounds = child.getbounds();
        Bounds parent_bounds = getbounds();

        int Height = Math.max(parent_bounds.getY() + parent_bounds.getHeight(),
                               child_bounds.getY() + child_bounds.getHeight() - parent_bounds.getY());
        int width = Math.max(parent_bounds.getWidth(), child_bounds.getWidth()); 
        
        parent_bounds.setBounds(parent_bounds.getX(), parent_bounds.getY(), width, Height);
        
        // System.out.println("Move: " + getbounds().getX() + " " + getbounds().getY() + " " + getbounds().getWidth() + " " + getbounds().getHeight());

        cursor.setBounds(cursor.getX(), cursor.getY() + child_bounds.getHeight(), cursor.getWidth(), cursor.getHeight());
    }

    public void adjustBounds (Bounds cursor) {
        // ajusting width of column
        // System.out.println("Adjust: " + getbounds().getX() + " " + getbounds().getY() + " " + getbounds().getWidth() + " " + getbounds().getHeight());
        int height = cursor.getY() - getbounds().getHeight();
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), getbounds().getWidth(), height);
    }

    @Override
    public void setSize(Window window) {
        
    }


}
