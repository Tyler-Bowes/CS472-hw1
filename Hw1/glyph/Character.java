package glyph;

import window.Window;

public class Character extends Glyph {

	private char character;


    public Character(char character) {
		this.character = character;
    }

    

    @Override
    public void draw(Window window) {
        window.drawCharacter(character, 0, 0);


        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
}

