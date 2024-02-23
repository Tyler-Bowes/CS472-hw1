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
}

