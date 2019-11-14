package drawingUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class RectDimsSelector extends JPanel {
    private int CurrentWidth;
    private int CurrentHeight;

    public RectDimsSelector(){
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(4,1));
        JLabel wlabel = new JLabel("Rectangle Width");
        JLabel hlabel = new JLabel("Rectangle Height");
        JSlider WidthSlider = new JSlider(1,100);
        JSlider HeightSlider = new JSlider(1,100);
        controls.add(wlabel);
        controls.add(WidthSlider);
        controls.add(hlabel);
        controls.add(HeightSlider);
        add(controls);
        CurrentWidth = WidthSlider.getValue();
        CurrentHeight = HeightSlider.getValue();
        WidthSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                CurrentWidth = WidthSlider.getValue();
            }
        });
        HeightSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                CurrentHeight = HeightSlider.getValue();
            }
        });


    }

    public int getCurrentWidth(){
        return CurrentWidth;
    }

    public int getCurrentHeight(){
        return CurrentHeight;
    }


}
