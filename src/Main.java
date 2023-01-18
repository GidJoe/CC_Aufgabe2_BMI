import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Mit der While-Schleife sorgen wir für ein ständiges Wiederholen des Programms, bis zu dem Zeitpunkt wo
        // "0" als Input gegeben wird. Durch eine Fallunterscheidung ( gewicht == 0 ) verlassen wir das Programm

        while (true) {

            // Variablen deklarieren
            double gewicht, größe, bmi;
            String output = "";

            // Inputs mit JOptionPane plus in DoubleParsen weil JOptionPane ein String abfragt
            gewicht = Double.parseDouble(JOptionPane.showInputDialog(" Bitte Gewicht eingeben (in kg)" + " oder 0 zum beenden"));

            // Wenn die Eingabe bei "Gewicht" == 0, dann beende die Schleife
            if (gewicht == 0) {
                break;
            }

            größe = Double.parseDouble(JOptionPane.showInputDialog(" Bitte Größe eingeben (in cm)"));

            // math.round (INHALT) .. ist eine Funktion um zu runden
            bmi = Math.round(gewicht / (größe * größe) * 10000);

            if (bmi >= 40) {
                output = "Adipositas Grad III";
            } else if (bmi >= 35) {
                output = "Adipositas Grad II";
            } else if (bmi >= 30) {
                output = "Adipositas Grad I";
            } else if (bmi >= 25) {
                output = "Übergewicht";
            } else if (bmi >= 20) {
                output = "Normalgewicht";
            } else {
                output = "Untergewicht";
            }
            JOptionPane.showMessageDialog(null, "Dein Body-Mass-Index: " + bmi + " \n" + output);
        }

    }
}