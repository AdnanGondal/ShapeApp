package main.java.shapes;
import shapes.Rectangle;


import java.awt.*;

public class Square extends Rectangle {
    //private int length;

    public Square(Point initpos, Color col,int length) {
        super(initpos,col,length,length);
    }
}
