package glyph;

import window.Window;

public class Character extends Glyph {
    // Implement the methods of the Glyph interface here

	private char character;


    public Character(char character) {
		this.character = character;
    }

    @Override
    public void sizing(int width, int height) {
        // Implementation for resize() method
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

    @Override
    public void draw(Window window) {
        window.drawCharacter(character, 0, 0);


        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
}

