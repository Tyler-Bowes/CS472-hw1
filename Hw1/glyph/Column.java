package glyph;

import java.util.ArrayList;

import window.Window;

public class Column extends Composition {
    // Implement the methods of the Glyph interface here

    public Column(SimpleCompositor compositor){
        setParent(null);
        getbounds().setBounds(0, 0, 0, 0);
        setCompositor(compositor);
        setChildren(new ArrayList<Glyph>());
        getCompositor().setComposition(this); // set the composition for the compositor
    }

    public void draw(Window window){
        super.draw(window);
    }

    public Glyph getChild(int index) throws UnsupportedOperationException {
        return super.getChild(index);
    }

    public void addChild(Glyph glyph, int index) throws UnsupportedOperationException {
        super.addChild(glyph, index);
    }

    public void remove(Glyph glyph) throws UnsupportedOperationException {
        super.remove(glyph);
    }

    public void setPosition(int x, int y) {
        getbounds().setBounds(x, y, getbounds().getWidth(), getbounds().getHeight());
    }

    public Bounds moveCursor(Bounds cursor, Glyph child) {
        // only changing cursor's y position (adding height of child)
        cursor.setBounds(cursor.getY(), cursor.getY() + child.getbounds().getHeight(), cursor.getWidth(), cursor.getHeight());
        return cursor;
    }

    public void adjustBounds (Bounds cursor) {
        // ajusting width of column
        int height = cursor.getY() - getbounds().getY();
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), getbounds().getWidth(), height);
    }

}
