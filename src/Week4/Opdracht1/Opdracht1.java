package Week4.Opdracht1;

import TI.BoeBot;
import TI.Servo;

public class Opdracht1 {
    public static int basisSnelheid = 1500;
    public static int snelheids1 = 1500;
    public static int snelheids2 = 1500;
    public static int verschil;
    public static Servo s1 = new Servo(12);
    public static Servo s2 = new Servo(13);

    public static void main(String[] args) {
        System.out.println("luisteren");
        while (true) {
            int analogeWaardeRechts = BoeBot.analogRead(1);
            int analogeWaardeMidden = BoeBot.analogRead(2);
            int analogeWaardeLinks = BoeBot.analogRead(3);
            BoeBot.wait(100);
            System.out.println("Analoge Waarde Rechts: " + analogeWaardeRechts);
            System.out.println("Analoge Waarde Midden: " + analogeWaardeMidden);
            System.out.println("Analoge Waarde Links: " + analogeWaardeLinks);
            BoeBot.wait(50);



            if (analogeWaardeMidden > 50)
            {
                s1.update(1500);
                s2.update(1500);
                s1.update(1476);
                s2.update(1525);
                if(analogeWaardeRechts > 50 && analogeWaardeMidden > 50)
                {
                    s1.update(1500);
                    s2.update(1500);
                    s1.update(1510);
                    s2.update(1511);
                }
                else if(analogeWaardeMidden > 50 && analogeWaardeLinks > 50)
                {
                    s1.update(1500);
                    s2.update(1500);
                    s1.update(1489);
                    s2.update(1490);
                }

            }
            else if (analogeWaardeLinks > 50)
            {
                s1.update(1500);
                s2.update(1500);
                s1.update(1489);
                s2.update(1490);

            }
            else if(analogeWaardeRechts > 50)
            {
                s1.update(1500);
                s2.update(1500);
                s1.update(1510);
                s2.update(1511);
            }


        }
    }

    public static void gaNaarSnelheid(int nieuweSnelheid)
    {
        verschil = nieuweSnelheid;
        int i ;
        for (i = 0; i < nieuweSnelheid; i++)
        {
            s1.update(snelheids1--);
            s2.update(snelheids2++);
            BoeBot.wait(20);
        }

        for (i=0; i > nieuweSnelheid; i--)
        {
            s1.update(snelheids1++);
            s2.update(snelheids2--);
            BoeBot.wait(20);
        }
    }

    public static void noodrem()
    {
        for (int i = snelheids1; i < 1500; i+=10)
        {
            s1.update(snelheids1+=10);
            s2.update(snelheids2-=10);
            BoeBot.wait(20);
        }

        for (int i = snelheids1; i > 1500; i-=10)
        {
            s1.update(snelheids1-=10);
            s2.update(snelheids2+=10);
            BoeBot.wait(20);
        }
        BoeBot.wait(100);
        snelheids1=1500;
        snelheids2=1500;
        s1.update(snelheids1);
        s2.update(snelheids2);

    }

    public static void draaien (int draaisnelheid)
    {
        snelheids1+=draaisnelheid;
        snelheids2+=draaisnelheid;
        s1.update(snelheids1);
        s2.update(snelheids2);
    }

    public static void draaiGraden(int graden, int draaiSnelheid)
    {
        draaien(draaiSnelheid);
        snelheids1-=graden;
        s1.update(snelheids1);
    }

    public static void reset()
    {
        snelheids2 = basisSnelheid;
        snelheids1 = basisSnelheid;
        s1.update(snelheids1);
        s2.update(snelheids2);
    }
}
