package glyph;

import window.Window;

public abstract class Composition extends CompositeGlyph {
    
    private Compositor compositor;
    
    public abstract Bounds moveBounds(Bounds cursor, Glyph child);
    public abstract void adjustBounds(Bounds cursor);

    public void compose(){
        compositor.compose();
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
        this.compose();
    }

    public void remove(Glyph glyph) throws UnsupportedOperationException{
        super.remove(glyph);
        this.compose();
    }

    public void draw(Window window){
        super.draw(window);
    }

}
