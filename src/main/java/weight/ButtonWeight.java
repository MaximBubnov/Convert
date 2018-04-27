package weight;

import window.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonWeight implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        if(Window.kiloText.getText().length() != 0 && Window.kiloText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new WeightConvert().kilo();
        } else if (Window.metrText.getText().length() != 0 && Window.metrText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new WeightConvert().metr();
        } else if (Window.decText.getText().length() != 0 && Window.decText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new WeightConvert().dec();
        } else if (Window.sanText.getText().length() != 0 && Window.sanText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new WeightConvert().san();
        } else if (Window.miliText.getText().length() != 0 && Window.miliText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new WeightConvert().mili();
        } else if (Window.mileText.getText().length() != 0 && Window.mileText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new WeightConvert().mile();
        } else if (Window.futText.getText().length() != 0 && Window.futText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new WeightConvert().fut();
        } else if (Window.dumText.getText().length() != 0 && Window.dumText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new WeightConvert().dume();
        } else {
            JOptionPane.showMessageDialog(null, "Одно из полней должно быть заполнено! \n\n Вводить можно только цифры!");
        }
    }
}
