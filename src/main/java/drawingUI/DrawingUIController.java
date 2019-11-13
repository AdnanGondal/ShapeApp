package drawingUI;

import shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();


    public DrawingUIController(){ //Needs to done in the class method.
        controlsPanel.setLayout(new GridLayout(3,1));
        mainPanel.setLayout(new GridLayout(2,1));
        Drawing drawing = new Drawing();
        ShapeSelector sSel = new ShapeSelector();
        ColourSelector cSel = new ColourSelector();
        CircleDimsSelector cDs = new CircleDimsSelector();
         //1 for Circle, 2 for Rectangle, 3 for Square
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int Selected_Shape = sSel.getCurrentShape();
                Color c = cSel.getCurrentColour();
                if (Selected_Shape ==1){
                drawing.addCircle(e.getPoint(),c,cDs.getCurrentRadius());

                }
                if (Selected_Shape ==2){
                    drawing.addRectangle(e.getPoint(),c,50,10);

                }
                if (Selected_Shape ==3){
                    drawing.addSquare(e.getPoint(),c,50);

                }
                drawing.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }


        });

        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(cDs);


    };

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
