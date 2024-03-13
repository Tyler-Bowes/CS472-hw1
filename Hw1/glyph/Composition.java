package glyph;

// Composite and Strategy
public abstract class Composition extends CompositeGlyph {
    
    private Compositor compositor;
    
    public Composition(Compositor compositor) {
        this.compositor = compositor;
    }

    public abstract void moveBounds(Bounds cursor, Glyph child);
    public abstract void adjustBounds(Bounds cursor);

    public void compose(){
        this.compositor.setComposition(this);
        getbounds().setBounds(this.getbounds().getX(), this.getbounds().getY(), 0, 0);
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

}
