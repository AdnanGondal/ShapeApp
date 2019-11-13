package shapes;
import main.java.shapes.Shape;

import java.awt.*;

public class Rectangle extends Shape {
    private int w;
    private int h;

    public Rectangle(Point initpos, Color col, int width, int height){
        super(initpos, col);
        w = width;
        h = height;

    }

    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,w,h);
    }
}
