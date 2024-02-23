package glyph;

import java.util.Iterator;
import java.util.Vector;

import window.Window;

// public abstract class CompositeGlyph extends Glyph {

//     private Vector<Glyph> _children;

//     // ...

//     public Iterator<Glyph> createIterator() {
// 	return new VectorIterator<Glyph>(_children);
//     }

// }

public class CompositeGlyph extends Glyph{
        // Implement the methods of the Glyph interface here

        @Override
        public void draw(Window _window) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'draw'");
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

}
