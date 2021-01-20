package Week3.Opdracht3;
import TI.BoeBot;
import TI.Servo;

public class OpdrachtA {
    static Servo sLinks = new Servo(12);
    static Servo sRechts = new Servo(13);

    public static void main(String[] args) {
        System.out.println("starten...");

        BoeBot.wait(5000);

        gaNaarSnelheid(200);

        while (true) {
            // Geluid versturen
            BoeBot.digitalWrite(0, true);
            BoeBot.wait(1);
            BoeBot.digitalWrite(0, false);

            // Tijd die het duurt ontvangen
            int pulseLength = BoeBot.pulseIn(1, true, 10000) / 58;

            // Kijken of er een object in de buurt is
            if (pulseLength <= 20) {
                // Boebot achteruit rijden
                gaNaarSnelheid(-125);
                // boebot omdraaien
                draaiGraden(180, 50);
                // Boebot weer laten rijden
                gaNaarSnelheid(200);
            }
            BoeBot.wait(50);
        }
    }

    public static void gaNaarSnelheid(int snelheid) {
        // Standaard snelheid
        int standaardSnelheid = 1500;

        // Als de snelheid hoger is dan 0
        if (snelheid > 0) {
            // Loopen door de snelheid en de Boebot langzaam sneller laten gaan
            for (int i = 0; i < snelheid; i++) {
                // Nieuwe snelheid op de Boebot zetten
                sLinks.update(standaardSnelheid - i);
                sRechts.update(standaardSnelheid + i);
                BoeBot.wait(20);
            }
        } else if (snelheid < 0) {
            // De Boebot achteruit laten rijden
            for (int i = 0; i > snelheid; i--) {
                // Snelheid op de Boebot
                sLinks.update(standaardSnelheid - i);
                sRechts.update(standaardSnelheid + i);
                BoeBot.wait(20);
            }
        }
    }

    public static void draaiGraden(int graden, int snelheid) {
        // kijken of het getal groter is dan 0
        if (snelheid > 0){
            // Tijd om te draaien bereken
            int tijdPerGraad = 420 / snelheid;

            // Boebot laten draaien
            sLinks.update(1500 + snelheid);
            sRechts.update(1500 + snelheid);
            // Boebot de berekende tijd laten wachten
            BoeBot.wait(tijdPerGraad * graden);
        } else if (snelheid < 0) {
            // Negatieve snelheid omdraaien naar positieve snelheid
            snelheid = Math.abs(snelheid);

            // Tijd om te draaien bereken
            int tijdPerGraad = 400 / snelheid;

            // Boebot laten draaien
            sLinks.update(1500 - snelheid);
            sRechts.update(1500 - snelheid);
            // Boebot de berekende tijd laten wachten
            BoeBot.wait(tijdPerGraad * graden);
        }

        noodrem();
    }

    public static void noodrem() {
        // Boebot stil laten staan
        sLinks.update(1600);
        sRechts.update(1400);

        sLinks.update(1500);
        sRechts.update(1500);
    }
}
