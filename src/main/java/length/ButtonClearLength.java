package length;

import window.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClearLength implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Window.kilogramText.setText("");
        Window.tonnaText.setText("");
        Window.miligramText.setText("");
        Window.grammText.setText("");
        Window.unciaText.setText("");
        Window.funtWeigthText.setText("");
    }
}
