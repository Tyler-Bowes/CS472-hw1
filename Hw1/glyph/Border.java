package glyph;

import window.Window;

public class Border extends Embellishment{
    
    private int border_width;

    public Border(Compositor compositor, int border_width){
        // super(compositor);
        this.border_width = border_width;
        // getbounds().setBounds(0, 0, 0, 0);
        setCompositor(compositor);
        getCompositor().setComposition(this); // set the composition for the compositor
    }

    public void draw(Window window){
        // temporary
        super.draw(window);
        //use border_width here somehow I think
    }


}
