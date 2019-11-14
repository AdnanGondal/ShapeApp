package drawingUI;

import shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    JPanel stats = new JPanel();
    private int Circlecounter = 0;
    private int RectCounter = 0;
    private int SquareCounter = 0;



    public DrawingUIController(){ //Needs to done in the class method.
        controlsPanel.setLayout(new GridLayout(3,2));
        mainPanel.setLayout(new GridLayout(2,1));
        stats.setLayout(new GridLayout(3,1));
        Drawing drawing = new Drawing();
        ShapeSelector sSel = new ShapeSelector();
        ColourSelector cSel = new ColourSelector();
        CircleDimsSelector cDs = new CircleDimsSelector();
        SquareDimsSelector sDs = new SquareDimsSelector();
        RectDimsSelector rDs = new RectDimsSelector();
        JLabel CircleStat = new JLabel("Circles: 0");
        JLabel SquareStat = new JLabel("Squares: 0");
        JLabel RectStat = new JLabel("Rectangle: 0");

         //1 for Circle, 2 for Rectangle, 3 for Square
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int Selected_Shape = sSel.getCurrentShape();
                Color c = cSel.getCurrentColour();
                if (Selected_Shape ==1){
                drawing.addCircle(e.getPoint(),c,cDs.getCurrentRadius());
                Circlecounter++;
                CircleStat.setText("Circles: " + Circlecounter);


                }
                if (Selected_Shape ==2){
                    drawing.addRectangle(e.getPoint(),c,rDs.getCurrentWidth(),rDs.getCurrentHeight());
                    RectCounter++;
                    RectStat.setText("Rectangles: "+ RectCounter);

                }
                if (Selected_Shape ==3){
                    drawing.addSquare(e.getPoint(),c,sDs.getCurrentSide());
                    SquareCounter++;
                    SquareStat.setText("Squares: "+SquareCounter);

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


        stats.add(CircleStat);
        stats.add(SquareStat);
        stats.add(RectStat);
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(cDs);
        controlsPanel.add(sDs);
        controlsPanel.add(rDs);
        controlsPanel.add(stats);
        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);


    };

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
