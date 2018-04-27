package temperature;

import window.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClear implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Window.celciumText.setText("");
        Window.farengateText.setText("");
        Window.kelvinText.setText("");
        Window.reomorText.setText("");
        Window.delText.setText("");
    }
}
