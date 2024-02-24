package glyph;

import window.Window;

public class Character extends Glyph {

	private char character;


    public Character(char character) {
		this.character = character;
        getbounds().setBounds(0, 0, 0, 0); // initially 0
        setParent(null);
    }

    public void draw(Window window) {
        window.drawCharacter(character, getbounds().getX(), getbounds().getY());
    }

    @Override
    public void setSize(Window window) {
        // x and y don't change, width and height are taken by window methods
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), window.charHeight(character), window.charWidth(character));
    }

    public void setPosition(Bounds cursor) {
        getbounds().setBounds(cursor.getX(), cursor.getY(), getbounds().getWidth(), getbounds().getHeight());
    }
}

