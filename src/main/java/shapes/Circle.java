package shapes;
import main.java.shapes.Shape;

import java.awt.*;

public class Circle extends Shape {
    private int rad; // Fields
    public Circle(Point initPos, Color col, int radius){ // The constructor
        super(initPos,col);  //so it calls shape constructor
        rad=radius; // Initialize fields
        pos=initPos;
        this.col=col;


    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad,rad);
    }


}
