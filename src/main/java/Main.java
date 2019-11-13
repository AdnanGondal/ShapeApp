import drawingUI.DrawingUIController;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    static GraphicsConfiguration gc; // Class field containing config info
    public static void main(String args[]){
        System.out.println("HelloWorld");

        JFrame frame= new JFrame(gc); // Create a new JFrame
        frame.setSize(500,600);
        frame.setVisible(true);
            // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        DrawingUIController drawingUIController = new DrawingUIController();
        frame.getContentPane().add(drawingUIController.getMainPanel());











    }
}
