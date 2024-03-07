package glyph;

// import java.util.ArrayList;

import window.Window;

public class Column extends Composition {
    // Implement the methods of the Glyph interface here

    public Column(SimpleCompositor compositor){
        // setParent(null);
        // getbounds().setBounds(0, 0, 0, 0);
        setCompositor(compositor);
        // setChildren(new ArrayList<Glyph>());
        getCompositor().setComposition(this); // set the composition for the compositor
    }

    // public void draw(Window window){
    //     super.draw(window);
    // }

    // public Glyph getChild(int index) throws UnsupportedOperationException {
    //     return super.getChild(index);
    // }

    // public void addChild(Glyph glyph, int index) throws UnsupportedOperationException {
    //     super.addChild(glyph, index);
    // }

    // public void remove(Glyph glyph) throws UnsupportedOperationException {
    //     super.remove(glyph);
    // }

    public void setPosition(Bounds cursor) {
        getbounds().setBounds(cursor.getX(), cursor.getY(), getbounds().getWidth(), getbounds().getHeight());
    }

    public Bounds moveBounds(Bounds cursor, Glyph child) {
        
        int Height = getbounds().getHeight(); // current max
        if (Height < child.getbounds().getY() + child.getbounds().getHeight() - getbounds().getY()) { // keep the maximum height of children
            Height = child.getbounds().getY() + child.getbounds().getHeight() - getbounds().getY();
        } 
        else { /* no need to update height */}
        
        int width = getbounds().getX() + child.getbounds().getWidth(); // sum the width of children
        if (width < child.getbounds().getWidth()) {
            width = child.getbounds().getWidth();
        } 
        else { /* no need to update width */ }
        
        getbounds().setBounds(getbounds().getX(), getbounds().getY() + child.getbounds().getHeight(), width, Height);
        cursor.setBounds(getbounds().getX(), getbounds().getY(), cursor.getWidth(), cursor.getHeight());;
        
        return cursor;
    }

    public void adjustBounds (Bounds cursor) {
        // ajusting width of column
        int height = cursor.getY() - getbounds().getY();
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), getbounds().getWidth(), height);
    }

    @Override
    public void setSize(Window window) {
        Glyph child;
        int maxWidth = 0;
        int height = 0;
        for (int index = 0; index < getChildren().size(); index++) {
            if (getChild(index) != null) {
                child = getChild(index);
                if (maxWidth < child.getbounds().getWidth()) { // keep the maximum width of children
                    maxWidth = child.getbounds().getWidth();
                }
                height += child.getbounds().getHeight();
            }
        }
        // set the width and height of column with all children
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), maxWidth, height);
    }


}
