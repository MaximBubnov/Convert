package temperature;

import window.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTemp implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {


        if(Window.celciumText.getText().length() != 0 && Window.celciumText.getText().matches("matches(\"^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$\")")) {
            new TemperatureConvert().celcium();
        }
        else if (Window.farengateText.getText().length() != 0 && Window.farengateText.getText().matches("matches(\"^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$\")")) {
            new TemperatureConvert().farengate();
        } else if (Window.kelvinText.getText().length() != 0 && Window.kelvinText.getText().matches("matches(\"^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$\")")) {
            new TemperatureConvert().kelvin();
        } else if (Window.reomorText.getText().length() != 0 && Window.reomorText.getText().matches("matches(\"^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$\")")) {
            new TemperatureConvert().reomure();
        } else if (Window.delText.getText().length() != 0 && Window.delText.getText().matches("matches(\"^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$\")")) {
            new TemperatureConvert().deli();
        } else {
            JOptionPane.showMessageDialog(null, "Одно из полей должно быть заполнено! \n\n Вводить можно только числа!");
        }
    }
}
