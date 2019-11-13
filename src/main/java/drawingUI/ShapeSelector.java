package drawingUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeSelector extends JPanel {
    private int Selected_Button;
    public ShapeSelector(){
        JRadioButton bCirc = new JRadioButton("Circle");
        JRadioButton bRect = new JRadioButton("Rectangle");
        JRadioButton bSquare = new JRadioButton("Square");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(bCirc);
        buttonGroup.add(bRect);
        buttonGroup.add(bSquare);
        add(bCirc);
        add(bRect);
        add(bSquare);
        bCirc.setSelected(true);
        Selected_Button=1;

        ActionListener CircSelect = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Selected_Button = 1;
            }
        };
        bCirc.addActionListener(CircSelect);
        ActionListener RectSelect = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Selected_Button = 2;
            }
        };
        bRect.addActionListener(RectSelect);
        ActionListener SquareSelect = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Selected_Button = 3;
            }
        };
        bSquare.addActionListener(SquareSelect);

    }


    public int getCurrentShape(){
        return Selected_Button;
    }

}
