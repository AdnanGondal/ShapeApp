package main.java.shapes;
import main.java.shapes.Draw;

import java.awt.*;

public abstract class Shape implements Draw {
    protected Point pos;
    protected Color col;

    public Shape(Point initpos, Color col) {
        pos = initpos;
        this.col=col;
    }

    public abstract void draw(Graphics g);
}
