package Week3.Opdracht1;

import TI.BoeBot;

public class OpdrachtB {
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
                break;
            case "010000010000":
                System.out.println("3");
                break;
            case "110000010000":
                System.out.println("4");
                break;
            case "001000010000":
                System.out.println("5");
                break;
            case "101000010000":
                System.out.println("6");
                break;
            case "011000010000":
                System.out.println("7");
                break;
            case "111000010000":
                System.out.println("8");
                break;
            case "000100010000":
                System.out.println("9");
                break;
            case "100100010000":
                System.out.println("0");
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
}
