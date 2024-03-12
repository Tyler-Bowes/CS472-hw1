package glyph;

// import java.util.ArrayList;

import window.Window;

public class Row extends Composition {
    
    public Row(SimpleCompositor compositor){
        super(compositor); // Call the superclass constructor
        setCompositor(compositor);
        getCompositor().setComposition(this); // set the composition for the compositor
    }

    public void setPosition(Bounds cursor) {
        getbounds().setBounds(cursor.getX(), cursor.getY(), getbounds().getWidth(), getbounds().getHeight());
    }

    public Bounds moveBounds(Bounds cursor, Glyph child) {
        // this ajusts the parent (current row) bounds and the cursor bounds
        int Height = getbounds().getHeight(); // current max
        if (Height < child.getbounds().getHeight()) { // keep the maximum height of children
            Height = child.getbounds().getHeight();
        } 
        else { /* no need to update height */}
        
        int width = getbounds().getX() + child.getbounds().getWidth(); // sum the width of children
        if (width < child.getbounds().getX() + child.getbounds().getWidth() - getbounds().getX()) {
            width = child.getbounds().getX() + child.getbounds().getWidth() - getbounds().getX();
        } 
        else { /* no need to update width */ }
        
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), width, Height); 
        
        cursor.setBounds(getbounds().getX(), getbounds().getY(), cursor.getWidth(), cursor.getHeight());;
        
        return cursor;
    }

    public void adjustBounds (Bounds cursor) {
        // ajusting width of row
        int width = cursor.getX() - getbounds().getX();
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), width, getbounds().getHeight());
    }

    @Override
    public void setSize(Window window) {
        Glyph child;
        int maxHeight = 0;
        int width = 0;
        for (int index = 0; index < getChildren().size(); index++) {
            if (getChild(index) != null) {
                child = getChild(index);
                if (maxHeight < child.getbounds().getHeight()) { // keep the maximum height of children
                    maxHeight = child.getbounds().getHeight();
                }
                width += child.getbounds().getWidth(); // sum the width of children
            }
        }
        // set the width and height of column with all children
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), width, maxHeight);
    }

}
