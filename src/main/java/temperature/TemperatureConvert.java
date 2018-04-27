package temperature;

import window.Window;

public class TemperatureConvert {

    public void celcium() {

        double cel = Double.valueOf(Window.celciumText.getText());

        Window.farengateText.setText(String.valueOf((cel*1.8)+32));
        Window.kelvinText.setText(String.valueOf(cel + 273.15));
        Window.reomorText.setText(String.valueOf(cel * 0.8));
        Window.delText.setText(String.valueOf(cel * 148.5));
    }

    public void farengate() {

        double far = Double.valueOf(Window.farengateText.getText());

        Window.celciumText.setText(String.valueOf((far - 32)/1.8));
        Window.kelvinText.setText(String.valueOf((far-32/1.8+273)));
        Window.reomorText.setText(String.valueOf((far-32)*4/9));
        Window.delText.setText(String.valueOf((212-far)*5/6));
    }

    public void kelvin() {

        double kel = Double.valueOf(Window.kelvinText.getText());

        Window.celciumText.setText(String.valueOf(273.15 - kel));
        Window.farengateText.setText(String.valueOf(kel*9/5-459.67));
        Window.reomorText.setText(String.valueOf((kel-273.15)*4/5));
        Window.delText.setText(String.valueOf((373.15-kel)*3/2));
    }

    public void reomure() {

        double reom = Double.valueOf(Window.reomorText.getText());

        Window.celciumText.setText(String.valueOf(reom*5/4));
        Window.kelvinText.setText(String.valueOf(reom*5/4+273.15));
        Window.farengateText.setText(String.valueOf(reom*9/4+32));
        Window.delText.setText(String.valueOf((80-reom)*15/8));
    }

    public void deli() {

        double del = Double.valueOf(Window.delText.getText());

        Window.celciumText.setText(String.valueOf(100-del*2/3));
        Window.farengateText.setText(String.valueOf(212-del*6/5));
        Window.kelvinText.setText(String.valueOf(373.15-del*2/3));
        Window.reomorText.setText(String.valueOf(80-del*11/50));
    }
}
