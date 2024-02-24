package glyph;

import java.util.ArrayList;

import window.Window;

public class Row extends Composition {
    
    public Row(SimpleCompositor compositor){
        setParent(null);
        getbounds().setBounds(0, 0, 0, 0);
        setCompositor(compositor);
        setChildren(new ArrayList<Glyph>());
        getCompositor().setComposition(this); // set the composition for the compositor
    }

    public void draw(Window window){
        super.draw(window);
    }

    public Glyph getChild(int index) throws UnsupportedOperationException {
        return super.getChild(index);
    }

    public void addChild(Glyph glyph, int index) throws UnsupportedOperationException {
        super.addChild(glyph, index);
    }

    public void remove(Glyph glyph) throws UnsupportedOperationException {
        super.remove(glyph);
    }

    public void setPosition(Bounds cursor) {
        getbounds().setBounds(cursor.getX(), cursor.getY(), getbounds().getWidth(), getbounds().getHeight());
    }

    public Bounds moveBounds(Bounds cursor, Glyph child) {
        //only changing cursor's x position (adding width of child)
        cursor.setBounds(cursor.getX() + child.getbounds().getWidth(), cursor.getY(), cursor.getWidth() + child.getbounds().getWidth(), cursor.getHeight());
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
