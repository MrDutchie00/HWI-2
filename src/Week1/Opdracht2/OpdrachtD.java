package Week1.Opdracht2;

import TI.BoeBot;
import TI.Timer;

public class OpdrachtD {
    public static void main(String[] args)
    {
        //set Timers of 1.3 and 0.7 seconds
        Timer t1 = new Timer(1300);
        Timer t2 = new Timer(700);

        //start timers
        t1.mark();
        t2.mark();
        while (true)
        {
            //If timer one times out
            if (t1.timeout())
            {
                //Read state of light one
                boolean state = BoeBot.digitalRead(2);

                //If light one is on, turn it off, else turn it on
                if (state)
                {
                    BoeBot.digitalWrite(2, false);
                }
                else BoeBot.digitalWrite(2, true);
            }

            //If timer two times out
            if (t2.timeout())
            {
                //Read state of light two
                boolean state = BoeBot.digitalRead(9);

                //If light two is on, turn it off, else turn it on
                if (state)
                {
                    BoeBot.digitalWrite(9, false);
                }
                else BoeBot.digitalWrite(9, true);
            }
            BoeBot.wait(1);
        }
    }

}
