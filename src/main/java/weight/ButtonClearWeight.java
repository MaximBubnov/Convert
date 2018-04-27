package weight;

import window.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClearWeight implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Window.kiloText.setText("");
        Window.metrText.setText("");
        Window.decText.setText("");
        Window.sanText.setText("");
        Window.miliText.setText("");
        Window.mileText.setText("");
        Window.futText.setText("");
        Window.dumText.setText("");
    }
}
