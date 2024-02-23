package glyph;

import window.Window;

// add implemntation of glyph interface
public class glyphComponent extends Glyph {

    @Override
    public void draw(Window _window) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }

    
    @Override
    public Glyph getChild(int index) {
        // Implementation for getChild() method
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

