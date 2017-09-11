import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Guess
{   
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean wantstoplay = true;
        out.println("~~~~~~~~~~~~~~~~~~~~~");
        out.println("~~~Guess My Number~~~");
        out.println("~~~~~~~~~~~~~~~~~~~~~\n");
        out.println("Let's play!");
        out.println("");
        while(wantstoplay)
        {
            play();
            System.out.println("");
            System.out.println("Would you like to play again and see who can Guess My Number?");
            String anwser = keyboard.nextLine();
            if (anwser.equals("yes"))
                wantstoplay = true;
            else
                wantstoplay = false;
        } 
        out.println("");
        out.println("Thanks for playing! :)");
    }
    
    public static void play()
    {
        Scanner keyboard = new Scanner(System.in);
        Random randomNumber = new Random();
        int cValue = randomNumber.nextInt(100);
        boolean keepGuessing =true;
        int counter = 0;
        int guess = 0;
        int max =100;
        int min = 0;      
        //Name entry
        out.println("Who is player one? Enter your name.");
        String playerOne = keyboard.nextLine();
        out.println("Who is player two? Enter your name.");
        String playerTwo = keyboard.nextLine();
        out.println("\nHey, " + playerOne +" and " + playerTwo + ", let's see if you can Guess My Number.\n");
        out.println("It's a number between 1-100! " + playerOne + ", you first.");
        while(keepGuessing)
        {
            int attemptNum = 10;
            counter ++;
            guess = keyboard.nextInt();
            out.println("Guess: " + guess);
            if (guess >max || guess<min) {
                out.println("ERROR: You have entered an incorrect number. Try a different number.");
            }
            else if (guess == cValue) {
                keepGuessing=false;
                if(counter%2==0) {
                    out.println("WOW! You are awesome, " + playerTwo + "! You guessed the number correctly, YOU WIN! Better luck next time " + playerOne +".");
                }
                if (counter%2!=0) {
                    out.println("WOW! You are awesome! " + playerOne + " you guessed the number correctly, YOU WIN! Better luck next time " + playerTwo);
                }              
            }
            //too high section
            else if (guess > cValue && counter%2==0 && counter<=attemptNum) {
                out.println("You have guessed a number that is too high " + playerTwo + ".\n\nNext player, can you guess it?" );
            }
            else if (guess > cValue && counter%2!=0 && counter<=attemptNum) {
                out.println("You have guessed a number that is too high " + playerOne + ".\n\nNext player, can you guess it?" );
            }
            //too low section
            else if (guess < cValue && counter%2==0 && counter<=attemptNum) {
                out.println("You have guessed a number that is too low " + playerTwo + ".\n\nNext player, can you guess it?");
            }
            else if (guess < cValue && counter%2!=0 && counter<=attemptNum) {
                out.println("You have guessed a number that is too low " + playerOne + "\n\nNext player, can you guess it?");
            }
            //both wrong section
            else if (guess!= cValue && counter>attemptNum) {
                keepGuessing=false;
                out.println("Oh no " + playerTwo + " and " + playerOne + "! You have run out of guesses!! Sorry, maybe next time one of you will Guess My Number!");
            }
        }
    }
}
