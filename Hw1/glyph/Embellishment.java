package glyph;

import javax.naming.OperationNotSupportedException;

import window.Window;

public class Embellishment extends Composition{


    public void addchild(Glyph glyph) {
        
        if (getChildren().size() == 0) { // no child yet
            this.setParent(glyph.getParent());
            getChildren().add(glyph);
            glyph.setParent(this);
        }

        Glyph current = this;
        while(current.getParent() != null) { // progress up the tree
            current = current.getParent();
        }
        current.compose();
    }

    @Override
    public void addChild(Glyph glyph, int index) throws UnsupportedOperationException { 
        try {
            getChildren().get(0).addChild(glyph, index);
        } catch (OperationNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        glyph.setParent(getChildren().get(0)); // set the parent of the child to the composition

        Glyph current = this;
        while(current.getParent() != null) { // progress up the tree
                current = current.getParent();
        }
        current.compose();
    }

    @Override
    public void remove(Glyph glyph) throws UnsupportedOperationException {
        try {
            getChildren().get(0).remove(glyph);
        } catch (OperationNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Glyph current = this;
        while(current.getParent() != null) { // progress up the tree
                current = current.getParent();
        }
        current.compose();
    }

    @Override
    public Bounds moveBounds(Bounds cursor, Glyph child) {
        return cursor;
    }

    @Override
    public void adjustBounds(Bounds cursor) {
        Bounds bounds = getChildren().get(0).getbounds();
        getbounds().setBounds(bounds.getX(),bounds.getY(), bounds.getWidth(), bounds.getHeight());
    }

    @Override
    public void setSize(Window window) {
        getChildren().get(0).setSize(window);
    }
    
    public Glyph getChild() { //getting the *single* composition that's being embellished
        return getChildren().get(0);
    }

}
