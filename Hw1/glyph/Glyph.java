package glyph;

import javax.naming.OperationNotSupportedException;

import window.Window;

public abstract class Glyph {

    private Glyph parent;
    private Bounds bounds = new Bounds(0, 0, 0, 0); //x,y,height,width is all in bounds


    public abstract void draw(Window _window);
    public abstract void setSize(Window window);
    
    public Glyph getParent() {
        return parent;
    }

    public void setParent(Glyph parent) {
        this.parent = parent;
    }

    public void addChild(Glyph glyph, int index) throws OperationNotSupportedException {
        try {
            throw new OperationNotSupportedException("This Glyph cannot have children");
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
            return;
        }
    }
    
    public void remove(Glyph glyph) throws OperationNotSupportedException {
        try {
            throw new OperationNotSupportedException("This Glyph cannot have children");
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
            return;
        }
    }
    
    // returns the child if there is one at specified index
    public Glyph getChild(int index) {
        try {
            throw new OperationNotSupportedException("This Glyph cannot have children");
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // returns the bounds of the glyph so we can access through all glyphs
    public Bounds getbounds() {
        return bounds;
    }
    public void adjustBounds(Bounds cursor) {
        throw new UnsupportedOperationException("Unimplemented method 'adjustBounds'");
    }
    public void compose() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compose'");
    }
    public Bounds moveBounds(Bounds cursor, Glyph child) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveBounds'");
    }

}