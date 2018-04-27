package length;

import window.Window;

public class LengthConvert {

    public void kilogram() {

        double kilo = Double.valueOf(Window.kiloText.getText());

        Window.grammText.setText(String.valueOf(kilo * 1_000));
        Window.tonnaText.setText(String.valueOf(kilo * 0.001));
        Window.miligramText.setText(String.valueOf(kilo * 1_000_000));
        Window.unciaText.setText(String.valueOf(kilo * 35.27));
        Window.funtWeigthText.setText(String.valueOf(kilo * 2.205));

    }

    public void gram() {

        double gram = Double.valueOf(Window.grammText.getText());

        Window.kilogramText.setText(String.valueOf(gram * 0.001));
        Window.tonnaText.setText(String.valueOf(gram * 0.000001));
        Window.miligramText.setText(String.valueOf(gram * 1000));
        Window.unciaText.setText(String.valueOf(gram * 0.3527));
        Window.funtWeigthText.setText(String.valueOf(gram * 0.0022));
    }

    public void tonna() {

        double tonna = Double.valueOf(Window.tonnaText.getText());

        Window.kilogramText.setText(String.valueOf(tonna * 1000));
        Window.grammText.setText(String.valueOf(tonna * 1_000_000));
        Window.miligramText.setText(String.valueOf(tonna * 1_000_000_000));
        Window.unciaText.setText(String.valueOf(tonna * 35274));
        Window.funtWeigthText.setText(String.valueOf(tonna * 2205));
    }

    public void miligramm() {
        double tonna = Double.valueOf(Window.miligramText.getText());

        Window.kilogramText.setText(String.valueOf(tonna * 0.000001));
        Window.grammText.setText(String.valueOf(tonna * 0.001));
        Window.tonnaText.setText(String.valueOf(tonna * 0.000000001));
        Window.unciaText.setText(String.valueOf(tonna * 0.000035));
        Window.funtWeigthText.setText(String.valueOf(tonna * 0.0000022));
    }

    public void uncia() {

        double uncia = Double.valueOf(Window.unciaText.getText());

        Window.kilogramText.setText(String.valueOf(uncia * 0.028));
        Window.grammText.setText(String.valueOf(uncia * 28.35));
        Window.tonnaText.setText(String.valueOf(uncia * 0.000028));
        Window.miligramText.setText(String.valueOf(uncia * 28350));
        Window.funtWeigthText.setText(String.valueOf(uncia * 0.0625));
    }

    public void funtLength() {
        double funt = Double.valueOf(Window.funtWeigthText.getText());

        Window.kilogramText.setText(String.valueOf(funt * 0.4536));
        Window.grammText.setText(String.valueOf(funt * 453.6));
        Window.tonnaText.setText(String.valueOf(funt * 0.000453));
        Window.miligramText.setText(String.valueOf(funt * 453592));
        Window.unciaText.setText(String.valueOf(funt * 16));
    }
}
