import static java.lang.System.out;
import java.util.Scanner;
public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int goalMet = 0;
        // Your code goes below here.
        out.println("Checking sales goals.");
        //veggie
        out.println("The sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwiches were sold today?");
        int vegSold = keyboard.nextInt();
        out.println("");
        if (vegSold >= 50)
        {
            out.println("Made goal for veggies.");
            goalMet++;
        }
        else
        {
            out.println("Fell short for veggies.");
        }
        //burger
        out.println("The sales goal for burgers is 250");
        out.println("How many burgers were sold today?");
        int burgSold = keyboard.nextInt();
        out.println("");
        if (burgSold >= 250)
        {
            out.println("Made goal for burgers.");
            goalMet++;
        }
        else
        {
            out.println("Fell short for burgers.");
        }
        //subs
        out.println("The sales goal for subs is 180");
        out.println("How many subs were sold today?");
        int subSold = keyboard.nextInt();
        out.println("");
        if (subSold >= 180)
        {
            out.println("Made goal for subs.");
            goalMet++;
        }
        else
        {
            out.println("Fell short for subs.");
        }
        //soup
        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold today?");
        int soupSold = keyboard.nextInt();
        out.println("");
        if (soupSold >= 70)
        {
            out.println("Made goal for soup.");
            goalMet++;
        }
        else
        {
            out.println("Fell short for soup.");
        }
        out.println("");
        //Goal met    
        if (goalMet == 4)
        {
            out.println("Made goal for everything!");
        }
    }
}
