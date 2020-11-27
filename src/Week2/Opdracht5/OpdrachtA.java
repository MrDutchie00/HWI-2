package Week2.Opdracht5;

import TI.BoeBot;
import TI.Servo;

public class OpdrachtA {
    public static void main(String[] args)
    {
        gaNaarSnelheid(100);
    }
    public static void gaNaarSnelheid(int snelheid)
    {
        //Servo's declareren
        Servo s1 = new Servo(12);
        Servo s2 = new Servo(13);

        //Langzaam per getal optrekken
        for (int i = 0; i < snelheid; i++){
            s1.update(1500-i);
            s2.update(1500+i);
            BoeBot.wait(20);
        }
        //Behoud snelheid
        s1.update(1500-snelheid);
        s2.update(1500+snelheid);
    }
}
