package Week3.Opdracht2;

import TI.BoeBot;
import TI.Servo;

public class Opdracht2 {
    public static int basisSnelheid = 1500;
    public static int snelheids1 = 1500;
    public static int snelheids2 = 1500;
    public static int verschil;
    public static Servo s1 = new Servo(12);
    public static Servo s2 = new Servo(13);

    public static void main(String[] args) {
        System.out.println("luisteren");
        while (true) {
            int pulseLength = BoeBot.pulseIn(6, false, 6000);
            if (pulseLength > 2000)
            {
                int lengtes[] = new int[12];
                for (int i = 0; i <12; i++)
                {
                    lengtes[i] = BoeBot.pulseIn(6, false, 20000);
                }

                toets(lengtes);
            }
            BoeBot.wait(10);
        }
    }

    public static String binary(int array[]){
        String nummer="";
        for (int i = 0; i < 12; i++){
            if (array[i] < 1000){
                nummer+="0";
            }
            else{
                nummer+="1";
            }
        }
        return nummer;
    }

    public static String toets(int array[])
    {
        String nummer = binary(array);
        switch (nummer){
            case "000000010000":
                System.out.println("1");
                break;
            case "100000010000":
                System.out.println("2");
                gaNaarSnelheid(200);
                break;
            case "010000010000":
                System.out.println("3");
                break;
            case "110000010000":
                System.out.println("4");
                draaien(-40);
                break;
            case "001000010000":
                System.out.println("5");
                noodrem();
                break;
            case "101000010000":
                System.out.println("6");
                draaien(40);
                break;
            case "011000010000":
                System.out.println("7");
                break;
            case "111000010000":
                System.out.println("8");
                gaNaarSnelheid(-200);
                break;
            case "000100010000":
                System.out.println("9");
                break;
            case "100100010000":
                System.out.println("0");
                reset();
                break;
            case "101110010000":
                System.out.println("1-");
                break;
            case "111001110000":
                System.out.println("2-");
                break;
            default:
                System.out.println("invalid -1");
                break;
        }
        return "-1";
    }

    public static void gaNaarSnelheid(int nieuweSnelheid)
    {
        verschil = nieuweSnelheid;
        int i ;
        for (i = 0; i < nieuweSnelheid; i++)
        {
            s1.update(snelheids1--);
            s2.update(snelheids2++);
            BoeBot.wait(20);
        }

        for (i=0; i > nieuweSnelheid; i--)
        {
            s1.update(snelheids1++);
            s2.update(snelheids2--);
            BoeBot.wait(20);
        }
    }

    public static void noodrem()
    {
        for (int i = snelheids1; i < 1500; i+=10)
        {
            s1.update(snelheids1+=10);
            s2.update(snelheids2-=10);
            BoeBot.wait(20);
        }

        for (int i = snelheids1; i > 1500; i-=10)
        {
            s1.update(snelheids1-=10);
            s2.update(snelheids2+=10);
            BoeBot.wait(20);
        }
        BoeBot.wait(100);
        snelheids1=1500;
        snelheids2=1500;
        s1.update(snelheids1);
        s2.update(snelheids2);

    }

    public static void draaien (int draaisnelheid)
    {
        snelheids1+=draaisnelheid;
        snelheids2+=draaisnelheid;
        s1.update(snelheids1);
        s2.update(snelheids2);
    }

    public static void draaiGraden(int graden, int draaiSnelheid)
    {
        draaien(draaiSnelheid);
        snelheids1-=graden;
        s1.update(snelheids1);
    }

    public static void reset()
    {
        snelheids2 = basisSnelheid;
        snelheids1 = basisSnelheid;
        s1.update(snelheids1);
        s2.update(snelheids2);
    }
}
