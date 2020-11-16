package Week1.Opdracht1;

import TI.BoeBot;

public class OpdrachtD {
    public static void main(String[] args)
    {
        while (true)
        {
            BoeBot.digitalWrite(2, true);       //light on
            BoeBot.wait(10);                        //wait 0.01 sec
            BoeBot.digitalWrite(2, false);      //light off
            BoeBot.wait(10);                        //wait 0.01 sec
        }
    }

}
