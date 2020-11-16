package Week1.Opdracht3;

import TI.BoeBot;

public class OpdrachtB {
    public static void main(String[] args)
    {
        while (true)
        {
            //Read state of button
            boolean state = BoeBot.digitalRead(10);

            //If button is pressed, let the LED flash one second on and one second off. Else turn the LED off.
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
            }
        }
    }

}
