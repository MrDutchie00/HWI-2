package Week1.Opdracht1;

import TI.BoeBot;

public class OpdrachtB {

    public static void main(String[] args)
    {

        while (true)
        {
            BoeBot.digitalWrite(2, true);       //light on
            BoeBot.wait(1000);                      //wait one sec
            BoeBot.digitalWrite(2, false);      //light off
            BoeBot.wait(2000);                      //wait two sec
        }
    }

}
