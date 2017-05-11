import java.util.Random;

/*
*Steven Allen
*ITSE-1302
*4/11/2017
*Exercise 16
*Code makes program that rolls a pair of dice 1000 times, and counts the number of box cars that occur.
*/

public class Diceroll {

    public static void main ( String [] strArgs) {
        Random rdmNumber = new Random();
        int intdice1 = rdmNumber.nextInt(6)+1;
        int intdice2 = rdmNumber.nextInt(6)+1;
        int intcounter = 0;
        
        do{
            if (( intdice1 == 6) && (intdice2 ==6))
                intdice1 + intdice2
     }
     while (intcounter++ == 1000)
        System.out.println("Number rolled for die 1 is: "+intdice1);
        System.out.println("Number rolled for die 2 is: "+intdice2);
        System.out.println("Total amount of pairs rolled is: "+(intdice1+intdice2));
    }
}