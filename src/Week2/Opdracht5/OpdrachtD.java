package Week2.Opdracht5;

import TI.BoeBot;
import TI.Servo;

public class OpdrachtD {
    public static int basisSnelheid = 1500;
    public static int snelheids1 = 1500;
    public static int snelheids2 = 1500;
    public static int verschil;
    public static Servo s1 = new Servo(12);
    public static Servo s2 = new Servo(13);

    public static void main(String[] args)
    {
        s1.update(basisSnelheid);
        s2.update(basisSnelheid);
        gaNaarSnelheid(200);
        BoeBot.wait(5000);
        noodrem();
        BoeBot.wait(3000);
        draaien(20);
        BoeBot.wait(1000);
        reset();
        draaien((-20));
        BoeBot.wait(1000);
        reset();
        draaiGraden(90, 20);
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
