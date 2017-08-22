import static java.lang.System.out;
import java.util.Scanner;
public class MailMerge
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("----Thank You Letter----");
        out.println(" ");
        String personName = "";
        int donation = 0;
   
        while (!personName.equals("quit"))
        {
            // do some stuff
            out.print("Please enter a name: ");
            personName = keyboard.next();
            if (!personName.equals("quit")) {
                out.print("Donation amount: ");
                donation = keyboard.nextInt();
                out.println(" ");
                out.println("Dear " + personName + ",");
                out.println("Thank you for your donation! We rely on donors like you to keep our");
                out.println("organization effective, and you came through for us. Your donation of $" + donation);
                out.println("will help our efforts to make a difference in the world.\n");
                out.println("As you may know, we are a registered non-profit organization, so your");
                out.println("donation is tax deductible. You may use this letter as a receipt for tax");
                out.println("purposes.\n");
                out.println("Thank you again for your support!\n");
                out.println("Sincerely,");
                out.println("Paula Jones");
                out.println("YourCharity.org");
                out.println("");
            }
        }
        out.println("Done");
    }
}