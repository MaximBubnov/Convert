package currency;

import window.Window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClearCurrency implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        Window.dollText.setText("");
        Window.euroText.setText("");
        Window.funtText.setText("");
        Window.einaText.setText("");
        Window.canadaDollText.setText("");
        Window.gonDollText.setText("");
        Window.uanText.setText("");
        Window.rubText.setText("");
    }
}
