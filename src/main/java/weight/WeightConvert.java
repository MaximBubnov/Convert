package weight;

import window.Window;

public class WeightConvert {

    public void kilo() {

        double kilo = Double.valueOf(Window.kiloText.getText());

        Window.metrText.setText(String.valueOf(kilo * 1000));
        Window.decText.setText(String.valueOf(kilo * 10_000));
        Window.sanText.setText(String.valueOf(kilo * 100_000));
        Window.miliText.setText(String.valueOf(kilo * 1_000_000));
        Window.mileText.setText(String.valueOf(kilo * 0.6214));
        Window.futText.setText(String.valueOf(kilo * 3281));
        Window.dumText.setText(String.valueOf(kilo * 39_370));
    }

    public void metr() {

        double metr = Double.valueOf(Window.metrText.getText());

        Window.kiloText.setText(String.valueOf(metr * 0.001));
        Window.decText.setText(String.valueOf(metr * 10));
        Window.sanText.setText(String.valueOf(metr * 100));
        Window.miliText.setText(String.valueOf(metr * 1_000));
        Window.mileText.setText(String.valueOf(metr * 0.0006214));
        Window.futText.setText(String.valueOf(metr * 3.281));
        Window.dumText.setText(String.valueOf(metr * 39.37));
    }

    public void dec() {

        double dec = Double.valueOf(Window.decText.getText());

        Window.kiloText.setText(String.valueOf(dec * 0.0001));
        Window.metrText.setText(String.valueOf(dec * 0.1));
        Window.sanText.setText(String.valueOf(dec * 10));
        Window.miliText.setText(String.valueOf(dec * 100));
        Window.mileText.setText(String.valueOf(dec * 0.00006214));
        Window.futText.setText(String.valueOf(dec * 0.3281));
        Window.dumText.setText(String.valueOf(dec * 3.937));
    }

    public void san() {

        double san = Double.valueOf(Window.sanText.getText());

        Window.kiloText.setText(String.valueOf(san * 0.00001));
        Window.metrText.setText(String.valueOf(san * 0.01));
        Window.decText.setText(String.valueOf(san * 0.1));
        Window.miliText.setText(String.valueOf(san * 10));
        Window.mileText.setText(String.valueOf(san * 0.000006214));
        Window.futText.setText(String.valueOf(san * 0.03281));
        Window.dumText.setText(String.valueOf(san * 0.3937));
    }

    public void mili() {

        double mili = Double.valueOf(Window.miliText.getText());

        Window.kiloText.setText(String.valueOf(mili * 0.000001));
        Window.metrText.setText(String.valueOf(mili * 0.001));
        Window.decText.setText(String.valueOf(mili * 0.01));
        Window.sanText.setText(String.valueOf(mili * 0.1));
        Window.mileText.setText(String.valueOf(mili * 0.0000006214));
        Window.futText.setText(String.valueOf(mili * 0.003281));
        Window.dumText.setText(String.valueOf(mili * 0.03937));
    }

    public void mile() {

        double mile = Double.valueOf(Window.mileText.getText());

        Window.kiloText.setText(String.valueOf(mile * 1.609));
        Window.metrText.setText(String.valueOf(mile * 1_609));
        Window.decText.setText(String.valueOf(mile * 16_093));
        Window.sanText.setText(String.valueOf(mile * 160_934));
        Window.miliText.setText(String.valueOf(mile * 1_609_344));
        Window.futText.setText(String.valueOf(mile * 5_280));
        Window.dumText.setText(String.valueOf(mile * 63_360));
    }

    public void fut() {

        double fut = Double.valueOf(Window.futText.getText());

        Window.kiloText.setText(String.valueOf(fut * 0.003));
        Window.metrText.setText(String.valueOf(fut * 0.3048));
        Window.decText.setText(String.valueOf(fut * 3.048));
        Window.sanText.setText(String.valueOf(fut * 30.48));
        Window.miliText.setText(String.valueOf(fut * 304.8));
        Window.mileText.setText(String.valueOf(fut * 0.0001894));
        Window.dumText.setText(String.valueOf(fut * 12));
    }

    public void dume() {

        double dume = Double.valueOf(Window.dumText.getText());

        Window.kiloText.setText(String.valueOf(dume * 0.000025));
        Window.metrText.setText(String.valueOf(dume * 0.0254));
        Window.decText.setText(String.valueOf(dume * 0.254));
        Window.sanText.setText(String.valueOf(dume * 2.54));
        Window.miliText.setText(String.valueOf(dume * 25.4));
        Window.mileText.setText(String.valueOf(dume * 0.00001578));
        Window.futText.setText(String.valueOf(dume * 0.0833));
    }
}
