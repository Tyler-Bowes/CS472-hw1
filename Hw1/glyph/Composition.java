package glyph;

import window.Window;

public abstract class Composition extends CompositeGlyph {
    
    private Compositor compositor;
    
    public Composition(Compositor compositor) {
        super();
        this.compositor = compositor;
    }

    public abstract Bounds moveBounds(Bounds cursor, Glyph child);
    public abstract void adjustBounds(Bounds cursor);

    public void compose(){
        this.compositor.setComposition(this);
        getbounds().setBounds(0, 0, 0, 0);
        this.compositor.compose();
    }

    public Compositor getCompositor(){
        return compositor;
    }

    public void setCompositor(Compositor compositor){
        this.compositor = compositor;
    }

    public void addChild(Glyph glyph, int index) throws UnsupportedOperationException{
        super.addChild(glyph, index);

        glyph.setParent(this);
        Glyph current = this;
        while(current.getParent() != null) { // progress up the tree
                current = current.getParent();
        }
        current.compose();
    }

    public void remove(Glyph glyph) throws UnsupportedOperationException{
        super.remove(glyph);
        Glyph current = this;
        while(current.getParent() != null) { // progress up the tree
                current = current.getParent();
        }
        current.compose();
    }

    // public void draw(Window window){
    //     super.draw(window);
    // }

}
