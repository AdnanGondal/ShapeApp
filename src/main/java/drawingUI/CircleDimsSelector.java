package drawingUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class CircleDimsSelector extends JPanel {
    private int CurrentRadius;

    public CircleDimsSelector(){
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label = new JLabel("Circle Radius");
        JSlider RadiusSlider = new JSlider(1,100);
        controls.add(label);
        controls.add(RadiusSlider);
        add(controls);
        CurrentRadius = RadiusSlider.getValue();
        RadiusSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                CurrentRadius = RadiusSlider.getValue();
            }
        });


    }

    public int getCurrentRadius(){
        return CurrentRadius;
    }
}
