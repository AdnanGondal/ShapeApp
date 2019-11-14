package drawingUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SquareDimsSelector extends JPanel {
    private int CurrentSide;

    public SquareDimsSelector(){
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label = new JLabel("Square Side Length");
        JSlider SideSlider = new JSlider(1,100);
        controls.add(label);
        controls.add(SideSlider);
        add(controls);
        CurrentSide = SideSlider.getValue();
       SideSlider.addChangeListener(new ChangeListener() {
           @Override
           public void stateChanged(ChangeEvent e) {
               CurrentSide = SideSlider.getValue();
           }
       });

    }

    public int getCurrentSide(){
        return CurrentSide;
    }

}
