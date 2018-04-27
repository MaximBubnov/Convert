package length;

import window.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonLength implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        if(Window.kilogramText.getText().length() != 0 && Window.kilogramText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new LengthConvert().kilogram();
        } else if(Window.grammText.getText().length() != 0 && Window.grammText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new LengthConvert().gram();
        } else if (Window.tonnaText.getText().length() != 0 && Window.tonnaText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new LengthConvert().tonna();
        } else if (Window.miligramText.getText().length() != 0 && Window.miligramText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new LengthConvert().miligramm();
        } else if (Window.unciaText.getText().length() != 0 && Window.unciaText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new LengthConvert().uncia();
        } else if (Window.funtWeigthText.getText().length() != 0 && Window.funtWeigthText.getText().matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
            new LengthConvert().funtLength();
        } else {
            JOptionPane.showMessageDialog(null, "Одно из полней должно быть заполнено! \n\n Вводить можно только цифры!");
        }
    }
}
