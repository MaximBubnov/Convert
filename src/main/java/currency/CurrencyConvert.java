package currency;

import window.Window;

public class CurrencyConvert {

    public void dollarUSA() {

        double dollUSA = Double.valueOf(Window.dollText.getText());

        Window.euroText.setText(String.valueOf(dollUSA * 0.82));
        Window.funtText.setText(String.valueOf(dollUSA * 0.71));
        Window.einaText.setText(String.valueOf(dollUSA * 109.2));
        Window.canadaDollText.setText(String.valueOf(dollUSA * 1.28));
        Window.gonDollText.setText(String.valueOf(dollUSA * 7.84));
        Window.uanText.setText(String.valueOf(dollUSA * 6.32));
        Window.rubText.setText(String.valueOf(dollUSA * 62.08));
    }

    public void euro() {

        double euro = Double.valueOf(Window.euroText.getText());

        Window.dollText.setText(String.valueOf(euro * 1.218));
        Window.funtText.setText(String.valueOf(euro * 0.87));
        Window.einaText.setText(String.valueOf(euro * 133));
        Window.canadaDollText.setText(String.valueOf(euro * 1.57));
        Window.gonDollText.setText(String.valueOf(euro * 9.55));
        Window.uanText.setText(String.valueOf(euro * 7.69));
        Window.rubText.setText(String.valueOf(euro * 75.59));
    }

    public void funt() {

        double funt = Double.valueOf(Window.funtText.getText());

        Window.dollText.setText(String.valueOf(funt * 1.394));
        Window.euroText.setText(String.valueOf(funt * 1.144));
        Window.einaText.setText(String.valueOf(funt * 152.2));
        Window.canadaDollText.setText(String.valueOf(funt * 1.797));
        Window.gonDollText.setText(String.valueOf(funt * 10.94));
        Window.uanText.setText(String.valueOf(funt * 8.81));
        Window.rubText.setText(String.valueOf(funt * 86.5));

    }

    public void eina() {

        double eina = Double.valueOf(Window.einaText.getText());

        Window.dollText.setText(String.valueOf(eina * 0.009));
        Window.euroText.setText(String.valueOf(eina * 0.007));
        Window.funtText.setText(String.valueOf(eina * 0.006));
        Window.canadaDollText.setText(String.valueOf(eina * 0.011));
        Window.gonDollText.setText(String.valueOf(eina * 0.071));
        Window.uanText.setText(String.valueOf(eina * 0.057));
        Window.rubText.setText(String.valueOf(eina * 0.568));
    }

    public void canada() {

        double canada = Double.valueOf(Window.canadaDollText.getText());

        Window.dollText.setText(String.valueOf(canada * 0.77));
        Window.euroText.setText(String.valueOf(canada * 0.63));
        Window.funtText.setText(String.valueOf(canada * 0.55));
        Window.einaText.setText(String.valueOf(canada * 84.72));
        Window.gonDollText.setText(String.valueOf(canada * 6.08));
        Window.uanText.setText(String.valueOf(canada * 4.904));
        Window.rubText.setText(String.valueOf(canada * 48.15));
    }

    public void gon() {

        double gon = Double.valueOf(Window.gonDollText.getText());

        Window.dollText.setText(String.valueOf(gon * 0.12));
        Window.euroText.setText(String.valueOf(gon * 0.10));
        Window.funtText.setText(String.valueOf(gon * 0.09));
        Window.einaText.setText(String.valueOf(gon * 13.92));
        Window.canadaDollText.setText(String.valueOf(gon * 0.16));
        Window.uanText.setText(String.valueOf(gon * 0.80));
        Window.rubText.setText(String.valueOf(gon * 7.91));
    }

    public void uani() {

        double uani = Double.valueOf(Window.uanText.getText());

        Window.dollText.setText(String.valueOf(uani * 0.15));
        Window.euroText.setText(String.valueOf(uani * 0.12));
        Window.funtText.setText(String.valueOf(uani * 0.11));
        Window.einaText.setText(String.valueOf(uani * 17.28));
        Window.canadaDollText.setText(String.valueOf(uani * 0.203));
        Window.gonDollText.setText(String.valueOf(uani * 1.241));
        Window.rubText.setText(String.valueOf(uani * 9.819));

    }

    public void rub() {

        double rub = Double.valueOf(Window.rubText.getText());

        Window.dollText.setText(String.valueOf(rub * 0.016));
        Window.euroText.setText(String.valueOf(rub * 0.013));
        Window.funtText.setText(String.valueOf(rub * 0.011));
        Window.einaText.setText(String.valueOf(rub * 1.759));
        Window.canadaDollText.setText(String.valueOf(rub * 0.0207));
        Window.gonDollText.setText(String.valueOf(rub * 0.12));
        Window.uanText.setText(String.valueOf(rub * 0.1018));
    }
}
