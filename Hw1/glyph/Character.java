package glyph;

import window.Window;

// Composite
public class Character extends Glyph {

	private char character;


    public Character(char character) {
		this.character = character;
    }

    public void draw(Window window) {
        window.drawCharacter(character, getbounds().getX(), getbounds().getY());
    }

    @Override
    public void setSize(Window window) {
        // x and y don't change, width and height are taken by window methods
        getbounds().setBounds(getbounds().getX(), getbounds().getY(), window.charWidth(character), window.charHeight(character));
    }

}

