package Week2.Opdracht4;

import TI.Servo;

public class OpdrachtA {
    public static void main(String[] args)
    {
        Servo s1 = new Servo(12);
        Servo s2 = new Servo(13);

        //Laat de servo's draaien zodat ze kunnen worden gekalibreerd voor stilstand.
        s1.update(1500);
        s2.update(1500);

        while (true)
        {

        }
    }
}
