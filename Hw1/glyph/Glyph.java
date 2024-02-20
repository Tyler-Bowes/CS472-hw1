public interface Glyph {
    void draw();
    void add(Glyph glyph);
    void remove(Glyph glyph);
    Glyph getChild(int index);
    void resize(int width, int height);
}