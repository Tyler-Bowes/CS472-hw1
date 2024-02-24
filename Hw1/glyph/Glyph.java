package glyph;

import javax.naming.OperationNotSupportedException;

import window.Window;

public abstract class Glyph {

    private Glyph parent;
    private Bounds bounds = new Bounds(0, 0, 0, 0); //x,y,height,width is all in bounds


    public void draw(Window _window) {/* drawing happens in extended classes */}
    
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
}