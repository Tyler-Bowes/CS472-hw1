package glyph;

import javax.naming.OperationNotSupportedException;

import window.Window;

public class Glyph {

    private Glyph parent;
    private int width;
    private int height;
    private int x;
    private int y;

    // creating a class so I can access all sizing at once
    public class GlyphProperties {
        public int width;
        public int height;
        public int x;
        public int y;

        public GlyphProperties(int width, int height, int x, int y) {
            this.width = width;
            this.height = height;
            this.x = x;
            this.y = y;
        }
    }

    public GlyphProperties getProperties() {
        return new GlyphProperties(width, height, x, y);
    }
    
    public void draw(Window _window) {
        // implementation
    }
    
    public void add(Glyph glyph) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("This Glyph cannot have children");
    }
    
    public void remove(Glyph glyph) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("This Glyph cannot have children");
    }
    
    public Glyph getChild(int index) {
        try {
            // implementation
            return null;
        } catch (Exception e) {
            // handle the exception
            return null; // or throw a new exception, depending on your requirements
        }
    }
    
    public void sizing(int width, int height) {
        // implementation
    }
}