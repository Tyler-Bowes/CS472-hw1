package glyph;

import javax.naming.OperationNotSupportedException;

import window.Window;

public class Embellishment extends Composition{

    public Embellishment(Compositor compositor, Glyph glyph) {
        super(compositor);
        super.addChild(glyph, 0);
    }

    public void addChild(Glyph glyph, int index) throws UnsupportedOperationException { 
        try {
            getChild().addChild(glyph, index);
        } catch (OperationNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        glyph.setParent(getChild()); // set the parent of the child to the composition

        Glyph current = this;
        while(current.getParent() != null) { // progress up the tree
                current = current.getParent();
        }
        current.compose();
    }

    public void remove(Glyph glyph) throws UnsupportedOperationException {
        try {
            getChild().remove(glyph);
        } catch (OperationNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        glyph.setParent(null);

        Glyph current = this;
        while(current.getParent() != null) { // progress up the tree
                current = current.getParent();
        }
        current.compose();
    }

    public void moveBounds(Bounds cursor, Glyph child) {
        Bounds parent_bounds = getbounds();
        Bounds child_bounds = child.getbounds();

        int Height = Math.max(parent_bounds.getY() + parent_bounds.getHeight(),
                               child_bounds.getY() + child_bounds.getHeight() - parent_bounds.getY());        
        int width = Math.max(parent_bounds.getX() + parent_bounds.getWidth(),
                            child_bounds.getX() + child_bounds.getWidth() - parent_bounds.getX()); 

        parent_bounds.setBounds(parent_bounds.getX(), parent_bounds.getY(), width, Height);
        return;
    }

    public void adjustBounds(Bounds cursor) {
        return;
    }

    public void setSize(Window window) {
        return;
    }
    
    public Glyph getChild() { //getting composition that's being embellished
        return getChildren().get(0);
    }

}
