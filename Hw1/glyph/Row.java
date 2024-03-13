package glyph;

// import java.util.ArrayList;

import window.Window;

// Composite
public class Row extends Composition {
    
    public Row(SimpleCompositor compositor){
        super(compositor); // Call the superclass constructor
    }

    public Row(String string, SimpleCompositor compositor) {
        super(compositor);
        try {
            for (int i = 0; i < string.length(); i++) {
                addChild(new Character(string.charAt(i)), i);
            }
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
    }

    public void moveBounds(Bounds cursor, Glyph child) {
        Bounds child_bounds = child.getbounds();
        Bounds parent_bounds = getbounds();

        int Height = Math.max(parent_bounds.getHeight(), child_bounds.getHeight());

        int width = Math.max(parent_bounds.getX() + parent_bounds.getWidth(),
                             child_bounds.getX() + child_bounds.getWidth() - parent_bounds.getX()); 


        // this ajusts the parent (current row) bounds and the cursor bounds
        parent_bounds.setBounds(parent_bounds.getX(), parent_bounds.getY(), width, Height); 
        
        cursor.setBounds(cursor.getX() + child_bounds.getWidth(), cursor.getY(), cursor.getWidth(), cursor.getHeight());;
        
    }

    public void adjustBounds (Bounds cursor) {
        // ajusting width of row
        int width = cursor.getX() - getbounds().getX();
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), width, getbounds().getHeight());
    }

    @Override
    public void setSize(Window window) {
       
    }

}
