package glyph;

import window.Window;

// Strategy
public class SimpleCompositor implements Compositor{ // cannont extend b/c it's an interface

    private Composition composition;
    private Window window;

    public SimpleCompositor(Window window) {
        this.window = window;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    public void compose() {
        // create cursor based on parent
        Bounds cursor = composition.getbounds();
        Glyph child;
        // int index = 0;
        try {
            // for (... child= ...) {
            // for (Glyph child : composition.getChildren()) {
            for (int index = 0; index < composition.getChildren().size(); index++) {
                child = composition.getChild(index);
                // ask child to set size, based on window
                child.setSize(window);
                // ask child to set position, based on cursor
                child.setPosition(cursor);
                // ask child to compose itself, recursively
                child.compose();
                // ask parent to adjust itself and cursor, based on child
                composition.moveBounds(cursor, child);
            }
            // ask parent to adjust itself, based on cursor
            composition.adjustBounds(cursor);
            //checks if width or height has changed
            // composition.setSize(window);
        } catch (Exception e) {
            System.out.println("Error when running compose method!: " + e);
        }
    }
    
}
