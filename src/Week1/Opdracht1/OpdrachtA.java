package Week1.Opdracht1;

import TI.BoeBot;

public class OpdrachtA {
    public static void main(String[] args)
    {


        while (true)
        {
            BoeBot.digitalWrite(2, true);   //light on
            BoeBot.wait(1000);                  //Wait 1 sec
            BoeBot.digitalWrite(2, false);  //light off
            BoeBot.wait(1000);                  //wait 1 second
        }
    }

}
