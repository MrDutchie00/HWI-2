package Week1.Opdracht1;

import TI.BoeBot;

public class OpdrachtC {
    public static void main(String[] args)
    {
        while (true)
        {
            BoeBot.digitalWrite(2, true);   //light on
            BoeBot.wait(100);                   //wait 0.1 sec
            BoeBot.digitalWrite(2, false);  //light off
            BoeBot.wait(100);                   //wait 0.1 sec
        }
    }

}
