package glyph;

import window.Window;

public abstract class Composition extends CompositeGlyph {
    private SimpleCompositor compositor;
    
    public void compose(){
        compositor.compose();
    }

    public SimpleCompositor getCompositor(){
        return compositor;
    }

    public void setCompositor(SimpleCompositor compositor){
        this.compositor = compositor;
    }

    public void addChild(Glyph glyph, int index) throws UnsupportedOperationException{
        super.addChild(glyph, index);

        glyph.setParent(this);
    }

    public void remove(Glyph glyph) throws UnsupportedOperationException{
        super.remove(glyph);

    }

    public void draw(Window window){
        super.draw(window);
    }
}
