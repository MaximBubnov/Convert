package window;

import currency.ButtonClearCurrency;
import currency.ButtonCurrency;
import length.ButtonClearLength;
import length.ButtonLength;
import temperature.ButtonClear;
import temperature.ButtonTemp;
import weight.ButtonClearWeight;
import weight.ButtonWeight;

import javax.swing.*;
import java.awt.*;

public class Window {
    JFrame frame;
    JTabbedPane pane;
    public static JTextField celciumText;
    public static JTextField farengateText;
    public static JTextField kelvinText;
    public static JTextField reomorText;
    public static JTextField delText;

    public static JTextField dollText;
    public static JTextField euroText;
    public static JTextField funtText;
    public static JTextField einaText;
    public static JTextField canadaDollText;
    public static JTextField gonDollText;
    public static JTextField uanText;
    public static JTextField rubText;

    public static JTextField kiloText;
    public static JTextField metrText;
    public static JTextField decText;
    public static JTextField sanText;
    public static JTextField miliText;
    public static JTextField mileText;
    public static JTextField futText;
    public static JTextField dumText;

    public static JTextField tonnaText;
    public static JTextField kilogramText;
    public static JTextField grammText;
    public static JTextField miligramText;
    public static JTextField funtWeigthText;
    public static JTextField unciaText;


    public void go() {

        frame = new JFrame("Converter");
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        pane = new JTabbedPane();


//======================= T E M P E R A T U R E ================================================================
        JPanel temp = new JPanel();
        temp.setLayout(null);
        temp.setBackground(Color.PINK);
        temp.revalidate();

        JLabel temperature = new JLabel("Температурные шкалы");
        temperature.setBounds(300, 15, 250, 40);
        temperature.setFont(new Font("sanserif", Font.BOLD, 16));
        temperature.setForeground(Color.BLUE);
        temp.add(temperature);

        JButton countTemp = new JButton("Посчитать");
        countTemp.setBounds(350, 280, 100, 40);
        countTemp.addActionListener(new ButtonTemp());
        temp.add(countTemp);

        JButton clear = new JButton("Очистить поля");
        clear.setBounds(600, 280, 150,40);
        clear.addActionListener(new ButtonClear());
        temp.add(clear);

        JLabel celcium = new JLabel("градус Цельсия (°С)");
        celcium.setBounds(10, 80, 150, 40);
        temp.add(celcium);

        celciumText = new JTextField();
        celciumText.setBounds(150, 87, 150, 25);
        temp.add(celciumText);

        JLabel farengate = new JLabel("градус Фаренгейта (°F)");
        farengate.setBounds(10, 140, 150, 40);
        temp.add(farengate);

        farengateText = new JTextField();
        farengateText.setBounds(150, 147, 150, 25);
        temp.add(farengateText);

        JLabel kelvin = new JLabel("кельвин (К)");
        kelvin.setBounds(400, 80, 150, 40);
        temp.add(kelvin);

        kelvinText = new JTextField();
        kelvinText.setBounds(600, 87, 150, 25);
        temp.add(kelvinText);

        JLabel reomor = new JLabel("градус Реомюра (°RE)");
        reomor.setBounds(400, 140, 150, 40);
        temp.add(reomor);

        reomorText = new JTextField();
        reomorText.setBounds(600, 147, 150, 25);
        temp.add(reomorText);

        JLabel plane = new JLabel("градус Делия (°DE)");
        plane.setBounds(400, 200, 180, 40);
        temp.add(plane);

        delText = new JTextField();
        delText.setBounds(600, 207, 150, 25);
        temp.add(delText);

//================= C U R R E N C Y ============================================================

        JPanel curen = new JPanel();
        curen.setBackground(Color.cyan);
        curen.setLayout(null);
        curen.revalidate();

        JLabel curenLabel = new JLabel("Основные мировые валюты");
        curenLabel.setBounds(300,15,300, 40);
        curenLabel.setFont(new Font("sanserif", Font.BOLD, 16));
        curenLabel.setForeground(Color.BLUE);
        curen.add(curenLabel);

        JLabel dollar = new JLabel("Доллар США, $(USD)");
        dollar.setBounds(10,70,150,40);
        curen.add(dollar);

        dollText = new JTextField();
        dollText.setBounds(150, 77, 150,25);
        curen.add(dollText);

        JLabel euro = new JLabel("Евро, € (EUR)");
        euro.setBounds(10, 120, 150, 40);
        curen.add(euro);

        euroText = new JTextField();
        euroText.setBounds(150, 127, 150,25);
        curen.add(euroText);

        JLabel funt = new JLabel("Британский фунт (GBP)");
        funt.setBounds(10, 170, 150, 40);
        curen.add(funt);

        funtText = new JTextField();
        funtText.setBounds(150, 177, 150, 25);
        curen.add(funtText);

        JLabel eina = new JLabel("Японская йена (JPY)");
        eina.setBounds(10, 220, 150, 40);
        curen.add(eina);

        einaText = new JTextField();
        einaText.setBounds(150, 227, 150, 25);
        curen.add(einaText);

        JLabel canada = new JLabel("Канадский доллар, $(CAD)");
        canada.setBounds(400, 70, 170, 40);
        curen.add(canada);

        canadaDollText = new JTextField();
        canadaDollText.setBounds(600, 77, 150, 25);
        curen.add(canadaDollText);

        JLabel gon = new JLabel("Гонконгский доллар, $(HKD)");
        gon.setBounds(400, 120, 170, 40);
        curen.add(gon);

        gonDollText = new JTextField();
        gonDollText.setBounds(600, 127, 150,25);
        curen.add(gonDollText);

        JLabel uan =  new JLabel("Китайский юань (CNY)");
        uan.setBounds(400, 170,170, 40);
        curen.add(uan);

        uanText = new JTextField();
        uanText.setBounds(600, 177, 150, 25);
        curen.add(uanText);

        JLabel rub = new JLabel("Российский рубль (RUB)");
        rub.setBounds(400, 220, 170, 40);
        curen.add(rub);

        rubText = new JTextField();
        rubText.setBounds(600, 227, 150, 25);
        curen.add(rubText);

        JButton countCurrency = new JButton("Посчитать");
        countCurrency.setBounds(350,280,100,40);
        countCurrency.addActionListener(new ButtonCurrency());
        curen.add(countCurrency);

        JButton clearCurrency = new JButton("Очистить поля");
        clearCurrency.setBounds(600, 280, 150,40);
        clearCurrency.addActionListener(new ButtonClearCurrency());
        curen.add(clearCurrency);

//================================ W E I G H T ===================================================

        JPanel weight = new JPanel();
        weight.setLayout(null);
        weight.setBackground(Color.yellow);
        weight.revalidate();

        JLabel weightLabel = new JLabel("Метрические системы мер");
        weightLabel.setBounds(300,15,300, 40);
        weightLabel.setFont(new Font("sanserif", Font.BOLD, 16));
        weightLabel.setForeground(Color.BLUE);
        weight.add(weightLabel);

        JLabel kilo = new JLabel("Километр (км)");
        kilo.setBounds(10,70,150,40);
        weight.add(kilo);

        kiloText = new JTextField();
        kiloText.setBounds(150, 77, 150,25);
        weight.add(kiloText);

        JLabel metr = new JLabel("Метр (м)");
        metr.setBounds(10, 120, 150, 40);
        weight.add(metr);

        metrText = new JTextField();
        metrText.setBounds(150, 127, 150,25);
        weight.add(metrText);

        JLabel dec = new JLabel("Дециметр (дм)");
        dec.setBounds(10, 170, 150, 40);
        weight.add(dec);

        decText = new JTextField();
        decText.setBounds(150, 177, 150, 25);
        weight.add(decText);

        JLabel san = new JLabel("Сантиметр (см)");
        san.setBounds(10, 220, 150, 40);
        weight.add(san);

        sanText = new JTextField();
        sanText.setBounds(150, 227, 150, 25);
        weight.add(sanText);

        JLabel mili = new JLabel("Миллиметр (мм)");
        mili.setBounds(420, 70, 170, 40);
        weight.add(mili);

        miliText = new JTextField();
        miliText.setBounds(600, 77, 150, 25);
        weight.add(miliText);

        JLabel mile = new JLabel("Американская Миля (mi)");
        mile.setBounds(420, 120, 170, 40);
        weight.add(mile);

        mileText = new JTextField();
        mileText.setBounds(600, 127, 150,25);
        weight.add(mileText);

        JLabel fut =  new JLabel("Американский фут (ft)");
        fut.setBounds(420, 170,170, 40);
        weight.add(fut);

        futText = new JTextField();
        futText.setBounds(600, 177, 150, 25);
        weight.add(futText);

        JLabel dume = new JLabel("Американский дюйм (in)");
        dume.setBounds(420, 220, 170, 40);
        weight.add(dume);

        dumText = new JTextField();
        dumText.setBounds(600, 227, 150, 25);
        weight.add(dumText);

        JButton countWeight = new JButton("Посчитать");
        countWeight.setBounds(350,280,100,40);
        countWeight.addActionListener(new ButtonWeight());
        weight.add(countWeight);

        JButton clearWeight = new JButton("Очистить поля");
        clearWeight.setBounds(600, 280, 150,40);
        clearWeight.addActionListener(new ButtonClearWeight());
        weight.add(clearWeight);

//========================== L E N G T H =============================================================

        JPanel length = new JPanel();
        length.setLayout(null);
        length.setBackground(Color.lightGray);
        length.revalidate();

        JLabel lengthLabel = new JLabel("Перевод единиц веса и массы");
        lengthLabel.setBounds(300,15,300, 40);
        lengthLabel.setFont(new Font("sanserif", Font.BOLD, 16));
        lengthLabel.setForeground(Color.BLUE);
        length.add(lengthLabel);

        JLabel tona = new JLabel("Тонна (т)");
        tona.setBounds(10,70,150,40);
        length.add(tona);

        tonnaText = new JTextField();
        tonnaText.setBounds(150, 77, 150,25);
        length.add(tonnaText);

        JLabel kilogram = new JLabel("Килограмм (кг)");
        kilogram.setBounds(10, 120, 150, 40);
        length.add(kilogram);

        kilogramText = new JTextField();
        kilogramText.setBounds(150, 127, 150,25);
        length.add(kilogramText);

        JLabel gram = new JLabel("Грамм (г)");
        gram.setBounds(10, 170, 150, 40);
        length.add(gram);

        grammText = new JTextField();
        grammText.setBounds(150, 177, 150, 25);
        length.add(grammText);

        JLabel miligram = new JLabel("Миллиграмм (мг)");
        miligram.setBounds(420, 70, 170, 40);
        length.add(miligram);

        miligramText = new JTextField();
        miligramText.setBounds(600, 77, 150, 25);
        length.add(miligramText);

        JLabel funtWeight = new JLabel("Фунт (lb)");
        funtWeight.setBounds(420, 120, 170, 40);
        length.add(funtWeight);

        funtWeigthText = new JTextField();
        funtWeigthText.setBounds(600, 127, 150,25);
        length.add(funtWeigthText);

        JLabel uncia =  new JLabel("Унция (oz)");
        uncia.setBounds(420, 170,170, 40);
        length.add(uncia);

        unciaText = new JTextField();
        unciaText.setBounds(600, 177, 150, 25);
        length.add(unciaText);

        JButton countLength = new JButton("Посчитать");
        countLength.setBounds(350,280,100,40);
        countLength.addActionListener(new ButtonLength());
        length.add(countLength);

        JButton clearLength = new JButton("Очистить поля");
        clearLength.setBounds(600, 280, 150,40);
        clearLength.addActionListener(new ButtonClearLength());
        length.add(clearLength);

        JLabel labelName = new JLabel("©Bubnov Maxim");
        labelName.setBounds(10, 300, 100, 35);
        temp.add(labelName);

        JLabel label2 = new JLabel("©Bubnov Maxim");
        label2.setBounds(10,300,100,35);
        curen.add(label2);

        JLabel label3 = new JLabel("©Bubnov Maxim");
        label3.setBounds(10,300,100,35);
        weight.add(label3);

        JLabel label4 = new JLabel("©Bubnov Maxim");
        label4.setBounds(10,300,100,35);
        length.add(label4);

        pane.addTab("Temperature", temp);
        pane.addTab("Currency", curen);
        pane.addTab("Weight", weight);
        pane.addTab("Length", length);

        frame.add(pane);
        frame.setVisible(true);
    }
}
