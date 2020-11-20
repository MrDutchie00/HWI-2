package Week2.Opdracht1;

import TI.BoeBot;
import TI.PWM;
import TI.BoeBot;
import TI.PWM;


public class OpdrachtA {

    public static void main(String[] args)
    {
        PWM pwm = new PWM(15, 100); //Pulse Width Modulator aanmaken op poort 15
        pwm.start();                        //Start de PWM
        while (true)
        {
            BoeBot.wait(1000);          //Wacht 1 sec
            pwm.update(10);             //Zet de lamp aan op 10%
            BoeBot.wait(1000);          //Wacht 1 sec.
            pwm.update(75);             //Zet de lamp aan op 75%
            BoeBot.wait(1000);          //Wacht 1 sec
            pwm.update(50);             //Zet de lamp aan op 50%
            BoeBot.wait(1000);          //Wacht 1 sec
            pwm.update(00);             //Zet de lamp aan op 0% (UIT)
            BoeBot.wait(1000);          //Wacht 1 sec
            pwm.update(100);            //Zet de lamp aan op 100%
            BoeBot.wait(1000);          //Wacht 1 sec
            pwm.stop();                     //Stop de PWM
        }
    }
}
