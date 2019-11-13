package shapes;

import main.java.shapes.Shape;
import sun.security.provider.SHA;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {

    public ShapeDB() {};
    ArrayList<main.java.shapes.Shape> shapes = new ArrayList<main.java.shapes.Shape>();

    public void addSquare(Point pos,Color col,int side) {
        shapes.add(new main.java.shapes.Square(pos, col, side));
    }
    public void addCircle(Point pos,Color col,int rad) {
        shapes.add(new Circle(pos,col,rad));

    }
    public void addRect(Point pos,Color col,int w,int h) {
        shapes.add(new Rectangle(pos,col,w,h));

    }
    public void drawShapes(Graphics g) {
    for (Shape s:shapes) s.draw(g);
    }
}
