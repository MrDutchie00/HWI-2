package Week1.Opdracht4;

import TI.BoeBot;

public class OpdrachtA {
    public static void main(String[] args)
    {
        while (true)
        {
            //Read state of button
            boolean state = BoeBot.digitalRead(6);

            //If button is pressed, let light one flash one second on and one second off. Else have both leds turned off
            if (state)
            {
                BoeBot.digitalWrite(2, true);
                BoeBot.wait(1000);
                BoeBot.digitalWrite(2, false);
                BoeBot.wait(1000);
            }
            else
            {
                BoeBot.digitalWrite(2, false);
                BoeBot.digitalWrite(15, false);
            }
        }
    }

}
