package Week1.Opdracht3;

import TI.BoeBot;

public class OpdrachtA {
    public static void main(String[] args)
    {
        while (true)
        {
            //Read state of button
            boolean state = BoeBot.digitalRead(10);
            System.out.println(state);

            //If button is pressed, turn the light on, else turn it off
            if (state)
            {
                BoeBot.digitalWrite(2, true);
            }
            else
            {
                BoeBot.digitalWrite(2, false);
            }

            //Wait one second
            BoeBot.wait(1000);
        }
    }
}
