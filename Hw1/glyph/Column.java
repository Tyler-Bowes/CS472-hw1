package glyph;

// import java.util.ArrayList;

import window.Window;

public class Column extends Composition {
    // Implement the methods of the Glyph interface here

    public Column(SimpleCompositor compositor){
        super(compositor); // Call the superclass constructor
        setCompositor(compositor);
        getCompositor().setComposition(this); // set the composition for the compositor
    }

    // public void setPosition(Bounds cursor) {
    //     getbounds().setBounds(cursor.getX(), cursor.getY(), getbounds().getWidth(), getbounds().getHeight());
    // }

    public Bounds moveBounds(Bounds cursor, Glyph child) {
        Bounds child_bounds = child.getbounds();
        Bounds parent_bounds = getbounds();

        int Height = Math.max(parent_bounds.getY() + parent_bounds.getHeight(),
                               child_bounds.getY() + child_bounds.getHeight() - parent_bounds.getY());
        int width = Math.max(parent_bounds.getWidth(), child_bounds.getWidth()); 
        
        parent_bounds.setBounds(parent_bounds.getX(), parent_bounds.getY(), width, Height);

        cursor.setBounds(parent_bounds.getX(), parent_bounds.getY(), cursor.getWidth(), cursor.getHeight());;
        
        return cursor;
    }

    public void adjustBounds (Bounds cursor) {
        // ajusting width of column
        int height = cursor.getY() - getbounds().getY();
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), getbounds().getWidth(), height);
    }

    @Override
    public void setSize(Window window) {
        // Glyph child;
        // int maxWidth = 0;
        // int height = 0;
        // for (int index = 0; index < getChildren().size(); index++) {
        //     if (getChild(index) != null) {
        //         child = getChild(index);
        //         if (maxWidth < child.getbounds().getWidth()) { // keep the maximum width of children
        //             maxWidth = child.getbounds().getWidth();
        //         }
        //         height += child.getbounds().getHeight();
        //     }
        // }
        // // set the width and height of column with all children
        // getbounds().setBounds(getbounds().getX(), getbounds().getY(), maxWidth, height);
    }


}
