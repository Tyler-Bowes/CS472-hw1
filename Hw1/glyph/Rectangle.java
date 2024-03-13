package glyph;

import window.Window;

// Composite
public class Rectangle extends Glyph {

    // ** bounds keeps track of sizing **

    public Rectangle(int width, int height) {
        getbounds().setBounds(0, 0, width, height);
    }

    public void draw(Window window) {
        window.drawRectangle(getbounds().getX(), getbounds().getX(), getbounds().getWidth(), getbounds().getHeight());
    }

    @Override
    public void setSize(Window window) {
        // Size is already set when made
    }

}
