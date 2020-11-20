package Week2.Opdracht4;

import TI.Servo;

public class OpdrachtB {
    public static void main(String[] args)
    {
        //Servo's declareren
        Servo s1 = new Servo(12);
        Servo s2 = new Servo(13);

        //Servo's laten draaien
        s1.update(1700);
        s2.update(1300);

        while (true)
        {

        }
    }
}
