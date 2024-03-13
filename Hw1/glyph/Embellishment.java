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
        return;
    }

    public void adjustBounds(Bounds cursor) {
        Bounds parent_bounds = getbounds();
        Bounds child_bounds = getChild().getbounds();
        parent_bounds.setBounds(parent_bounds.getX(),parent_bounds.getY(), child_bounds.getWidth(), child_bounds.getHeight());
    }

    public void setSize(Window window) {
        getChild().setSize(window);
    }
    
    public Glyph getChild() { //getting the *single* composition that's being embellished
        return getChildren().get(0);
    }

}
