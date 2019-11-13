package drawingUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CircleDimsSelector extends JPanel {

    private int CurrentRadius;

    public CircleDimsSelector(){
        JSlider RadiusSlider = new JSlider(1,100);
        add(RadiusSlider);
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
