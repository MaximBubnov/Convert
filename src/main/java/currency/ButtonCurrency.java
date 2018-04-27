package currency;

import window.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCurrency implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        if(Window.dollText.getText().length() != 0 && Window.dollText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new CurrencyConvert().dollarUSA();
        } else if (Window.euroText.getText().length() != 0 && Window.euroText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new CurrencyConvert().euro();
        } else if (Window.funtText.getText().length() != 0 && Window.funtText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new CurrencyConvert().funt();
        } else if (Window.einaText.getText().length() != 0 && Window.einaText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new CurrencyConvert().eina();
        } else if (Window.canadaDollText.getText().length() != 0 && Window.canadaDollText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new CurrencyConvert().canada();
        } else if (Window.gonDollText.getText().length() != 0 && Window.gonDollText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new CurrencyConvert().gon();
        } else if (Window.uanText.getText().length() != 0 && Window.uanText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new CurrencyConvert().uani();
        } else if (Window.rubText.getText().length() != 0 && Window.rubText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new CurrencyConvert().rub();
        } else {
            JOptionPane.showMessageDialog(null, "Одно из полней должно быть заполнено! \n\n Вводить можно только цифры!");
        }
    }
}
