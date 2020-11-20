package Week2.Opdracht1;

import TI.BoeBot;
import TI.PWM;

public class OpdrachtB
{
    public static void main(String[] args)
    {
        PWM pwm = new PWM(15, 100); //PWM aanmaken
        pwm.start();                         //PWM starten
        while (true)
        {
            pwm.update(2);          //PWM op 2% aan, hierdoor kun je het lampje net aan zien
            BoeBot.wait(1000);      //Wacht 1 sec
            pwm.update(0);          //PWM op 0%
            BoeBot.wait(1000);      //Wacht 1 sec
            pwm.stop();                 //Stop pwm
        }
    }
}
