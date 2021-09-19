import java.util.Random;
import java.util.Scanner;

public class NumberGuessDemo {

    public static void main(String[] args){
        var numberGen = new Random();
        var hiddennumber = numberGen.nextInt(10)+1;
        var commmandLineReader = new Scanner(System.in);
        System.out.print("Guess a number from 1 to 10");
        var userguess = commmandLineReader.nextInt();
        while (userguess != hiddennumber) {
            if(hiddennumber == userguess) {
                System.out.println("you guessed it! "+ hiddennumber + " was the right one");
                break;


            }

        }
        {
            System.out.println("Sorry " +userguess + "  was not my number ");
            if (userguess - hiddennumber>0)
                System.out.println("Your guess was too high!");
            else
                System.out.println("Your guess was too low!");
            System.out.println("Try again");
            userguess=commmandLineReader.nextInt();



    }
}
