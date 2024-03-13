package glyph;

import java.util.ArrayList;

import window.Window;

// Composite and Strategy
public abstract class CompositeGlyph extends Glyph{

    private ArrayList<Glyph> children = new ArrayList<Glyph>();

    public void draw(Window _window) {
        for ( int child_index = 0; child_index < children.size(); child_index++ ) {
            if (children.get(child_index) != null) {
                children.get(child_index).draw(_window); // draws each child
            }
        }
    }
    
    public void addChild(Glyph glyph, int index) throws UnsupportedOperationException {
        if (index < 0) {
            throw new UnsupportedOperationException("Index out of bounds");
        }
        // do something later if index > children.size()?
        children.add(index, glyph);
        glyph.setParent(this);
    }

    public void remove(Glyph glyph) throws UnsupportedOperationException{ 
        if (!children.contains(glyph)) {
            throw new UnsupportedOperationException("Child not found");            
        }
        children.remove(glyph);
        glyph.setParent(null);
    }


    public Glyph getChild(int index) throws UnsupportedOperationException {
        if (index < 0 || index >= children.size()) {
            throw new UnsupportedOperationException("Index out of bounds");
        }
        return children.get(index);
    }

    public ArrayList<Glyph> getChildren() {
        return children;
    }

}
