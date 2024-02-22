package glyph;

import window.Window;

public class Rectangle extends Glyph {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Window window) {
        window.drawRectangle(0, 0, width, height);
    }
    
    @Override
    public void sizing(int width, int height) {
        // Implementation for resize() method
    }
    
    @Override
    public Glyph getChild(int index) {
        //throw new UnsupportedOperationException("Unimplemented method 'getChild'");
        return null;
    }
    
    @Override
    public void remove(Glyph glyph) {
        // Implementation for remove() method
    }
    
    @Override
    public void add(Glyph glyph) {
        // Implementation for add() method
    }

}
