package glyph;

import window.Window;

public class Rectangle extends Glyph {

    private int width;
    private int height;

    public Rectangle(int height, int width) {
        this.width = width;
        this.height = height;
    }

    public void draw(Window window) {
        window.drawRectangle(10, 10, width, height);
    }
    

}
