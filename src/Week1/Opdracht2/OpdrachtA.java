package Week1.Opdracht2;

import TI.BoeBot;

public class OpdrachtA {
    public static void main(String[] args)
    {
        while (true)
        {
            //Light 1 and 2 on
            BoeBot.digitalWrite(2, true);
            BoeBot.digitalWrite(9, true);

            //wait 1 sec
            BoeBot.wait(1000);

            //Light 1 and 2 off
            BoeBot.digitalWrite(2, false);
            BoeBot.digitalWrite(9, false);

            //wait one sec
            BoeBot.wait(1000);
        }
    }

}
