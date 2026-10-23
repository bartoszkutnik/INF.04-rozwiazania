import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Random;

public class Okno extends JFrame {
    public Okno() {
        setTitle("Dodaj pracownika 000000000");
        setSize(800, 380);

        JPanel mainPanel = new JPanel(null);
        mainPanel.setOpaque(true);
        mainPanel.setBackground(Color.decode("#B0C4DE"));

        JPanel danePracownikaPanel = new JPanel(null);
        TitledBorder borderPracownik = new TitledBorder(new LineBorder(Color.WHITE, 3), "Dane pracownika");
        danePracownikaPanel.setBorder(borderPracownik);
        danePracownikaPanel.setBounds(35, 30, 295, 240);
        danePracownikaPanel.setBackground(Color.decode("#B0C4DE"));

        JLabel imieLabel = new JLabel("Imię");
        imieLabel.setBounds(35, 20, 200, 50);
        JTextField imieField = new JTextField();
        imieField.setBounds(120, 30, 145, 30);

        JLabel nazwiskoLabel = new JLabel("Nazwisko");
        nazwiskoLabel.setBounds(35, 70, 200, 50);
        JTextField nazwiskoField = new JTextField();
        nazwiskoField.setBounds(120, 80, 145, 30);

        JLabel stanowiskoLabel = new JLabel("Stanowisko");
        stanowiskoLabel.setBounds(35, 120, 200, 50);
        JComboBox stanowiskoBox = new JComboBox();
        stanowiskoBox.addItem("");
        stanowiskoBox.addItem("Kierownik");
        stanowiskoBox.addItem("Starszy programista");
        stanowiskoBox.addItem("Młodszy programista");
        stanowiskoBox.addItem("Tester");
        stanowiskoBox.setBounds(120, 130, 145, 30);


        danePracownikaPanel.add(imieLabel);
        danePracownikaPanel.add(imieField);
        danePracownikaPanel.add(nazwiskoLabel);
        danePracownikaPanel.add(nazwiskoField);
        danePracownikaPanel.add(stanowiskoLabel);
        danePracownikaPanel.add(stanowiskoBox);


        JPanel generowanieHaslaPanel = new JPanel(null);
        TitledBorder borderHasla = new TitledBorder(new LineBorder(Color.WHITE, 3), "Generowanie hasła");
        generowanieHaslaPanel.setBorder(borderHasla);
        generowanieHaslaPanel.setBounds(420, 30, 320, 240);
        generowanieHaslaPanel.setBackground(Color.decode("#B0C4DE"));


        JLabel znakiLabel = new JLabel("Ile znaków?");
        znakiLabel.setBounds(35, 20, 200, 50);
        JTextField znakiField = new JTextField();
        znakiField.setBounds(120, 30, 155, 30);

        JCheckBox maleWielkieLiteryCheckBox = new JCheckBox("Małe i wielkie litery");
        maleWielkieLiteryCheckBox.setBackground(Color.decode("#B0C4DE"));
        maleWielkieLiteryCheckBox.setSelected(true);
        maleWielkieLiteryCheckBox.setBounds(28, 80, 200, 30);

        JCheckBox cyfryCheckbox = new JCheckBox("Cyfry");
        cyfryCheckbox.setBackground(Color.decode("#B0C4DE"));
        cyfryCheckbox.setBounds(28, 115, 200, 30);

        JCheckBox znakiSpecjalneCheckbox = new JCheckBox("Znaki specjalne");
        znakiSpecjalneCheckbox.setBackground(Color.decode("#B0C4DE"));
        znakiSpecjalneCheckbox.setBounds(28, 150, 200, 30);

        JButton generujHasloButton = new JButton("Generuj hasło");
        generujHasloButton.setBackground(Color.decode("#4682B4"));
        generujHasloButton.setMargin(new Insets(0, 0, 0, 0));
        generujHasloButton.setBounds(105, 190, 88, 28);
        generujHasloButton.setForeground(Color.WHITE);


        generowanieHaslaPanel.add(znakiField);
        generowanieHaslaPanel.add(znakiLabel);
        generowanieHaslaPanel.add(maleWielkieLiteryCheckBox);
        generowanieHaslaPanel.add(cyfryCheckbox);
        generowanieHaslaPanel.add(znakiSpecjalneCheckbox);
        generowanieHaslaPanel.add(generujHasloButton);


        JButton zatwierdzButton = new JButton("Zatwierdź");
        zatwierdzButton.setBackground(Color.decode("#4682B4"));
        zatwierdzButton.setMargin(new Insets(0, 0, 0, 0));
        zatwierdzButton.setBounds(230, 295, 250, 28);
        zatwierdzButton.setForeground(Color.WHITE);

        mainPanel.add(danePracownikaPanel);
        mainPanel.add(generowanieHaslaPanel);
        mainPanel.add(zatwierdzButton);

        add(mainPanel);

        StringBuilder haslo = new StringBuilder();

        generujHasloButton.addActionListener(e -> {
            haslo.setLength(0);
            int liczbaZnakow = Integer.parseInt(znakiField.getText());
            String zestawMalychLiter = "qwertyuiopasdfghjklzxcvbnm";
            String zestawDuzychLiter = "QWERTYUIOPASDFGHJKLZXCVBNM";
            String zestawSpecjalnych = "!@#$%^&*()_+-=";
            String zestawCyfr = "0123456789";

            Random random = new Random();
            for (int i = 0; i < liczbaZnakow; i++) {
                int indeks = random.nextInt(zestawMalychLiter.length());
                char wylosowanaLitera = zestawMalychLiter.charAt(indeks);
                haslo.append(wylosowanaLitera);
            }
            if (maleWielkieLiteryCheckBox.isSelected()) {
                int indeks = random.nextInt(zestawDuzychLiter.length());
                char wylosowanyZnak = zestawDuzychLiter.charAt(indeks);
                haslo.setCharAt(0, wylosowanyZnak);
            }
            if (cyfryCheckbox.isSelected()) {
                int indeks = random.nextInt(zestawCyfr.length());
                char wylosowanyZnak = zestawCyfr.charAt(indeks);
                haslo.setCharAt(1, wylosowanyZnak);
            }
            if (znakiSpecjalneCheckbox.isSelected()) {
                int indeks = random.nextInt(zestawSpecjalnych.length());
                char wylosowanyZnak = zestawSpecjalnych.charAt(indeks);
                haslo.setCharAt(2, wylosowanyZnak);
            }
            JOptionPane.showMessageDialog(this, haslo.toString());
        });
        zatwierdzButton.addActionListener(v -> {
            String imie = imieField.getText();
            String nazwisko = nazwiskoField.getText();
            String stanowisko = (String) stanowiskoBox.getSelectedItem();
            JOptionPane.showMessageDialog(this, "Dane pracownika: " + imie + " " + nazwisko + " " + stanowisko + " Hasło: " + haslo);
        });
    }
}
