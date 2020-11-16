package Week1.Opdracht2;

import TI.BoeBot;
import TI.Timer;

public class OpdrachtE {

    public static void main(String[] args)
    {
        //Set timers for 1.3, 0.7, 0.8 and 1.7 seconds
        Timer t1 = new Timer(1300);
        Timer t2 = new Timer(700);
        Timer t3 = new Timer(800);
        Timer t4 = new Timer(1700);
        //Start timers 1 and 3
        t1.mark();
        t3.mark();

        while (true)
        {
            //if timer one times out
            if (t1.timeout())
            {
                //Use a digitalRead to read the state of light one, if it is turned on, turn it off and start Timer 2.
                boolean state = BoeBot.digitalRead(2);
                if (state)
                {
                    BoeBot.digitalWrite(2, false);
                    t2.mark();
                }
            }

            //If timer two times out
            if (t2.timeout())
            {
                //Use a digitalRead to read the state of light one, if it is turned on, turn it off and start Timer 1.
                boolean state = BoeBot.digitalRead(2);
                if (!state)
                {
                    BoeBot.digitalWrite(2, true);
                    t1.mark();
                }
            }

            //If timer three times out
            if (t3.timeout())
            {
                //Use a digitalRead to read the state of light one, if it is turned on, turn it off and start Timer 4.
                boolean state = BoeBot.digitalRead(9);
                if (state)
                {
                    BoeBot.digitalWrite(9, false);
                    t4.mark();
                }
            }

            //If timer four times out
            if (t4.timeout())
            {
                //Use a digitalRead to read the state of light one, if it is turned on, turn it off and start Timer 3.
                boolean state = BoeBot.digitalRead(9);
                if (!state)
                {
                    BoeBot.digitalWrite(9,true);
                    t3.mark();
                }
            }
            BoeBot.wait(1);
        }
    }
}
