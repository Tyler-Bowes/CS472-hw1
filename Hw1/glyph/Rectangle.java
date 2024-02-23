package glyph;

import window.Window;

public class Rectangle extends Glyph {

    // ** bounds keeps track of sizing **

    public Rectangle(int height, int width) {
        getbounds().setBounds(0, 0, width, height);
        setParent(null);
    }

    // public void draw(Window window) {
    //     window.drawRectangle(getbounds().getX(), getbounds().getX(), getbounds().getWidth(), getbounds().getHeight());
    // }
    
}
