import static java.lang.System.out;
import java.util.Scanner;
public class temperatures {


    public static void main(String[] args) {
        String[] hours = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
        String[] days = {"Sun: ", "Mon: ", "Tue: ", "Wed: ", "Thu: ", "Fri: ", "Sat: "};
        int[][] temps = {{68, 70, 76, 70, 68, 71, 75}, {76, 76, 87, 84, 82, 75, 83},
                {73, 72, 81, 78, 76, 73, 77}, {64, 65, 69, 68, 70, 74, 72}};

       out.println("Temperature Calculator");
       out.println();
       out.println("The data provided are:");

        for (int row = 0; row < 4; row++) {
            System.out.print(hours[row]);
            for (int column = 0; column < 7; column++) {
                System.out.print(temps[row][column] + ", ");
            }
            System.out.println(" ");
        }
       out.print("\n");

//average days
        System.out.println("Based on that data, the following are the average temperatures for the week. \n");
        for (int column = 0; column < 7; column++)
        {
            int sumOfDays = 0;
            for (int row = 0; row < 4; row++) {
                sumOfDays += temps[row][column];
            }
            System.out.println(days[column] + (sumOfDays/hours.length) );
        }
       out.print("\n");
        
//average hours
        for (int row = 0; row < 4; row++)
        {
            int sumOfHours = 0;
            for (int column = 0; column < 7; column++) {
                sumOfHours += temps[row][column];
            }
            out.println(hours[row] + (sumOfHours/days.length) );

        }
        
//total average
        out.println("\nThe final average temperature for the week was: \n");
        int totalSum = 0;
        for (int row = 0; row < 4; row++)
        {
            for (int column = 0; column < 7; column++) {
                totalSum += temps[row][column];
            }
        }

        out.println("Overall: " + totalSum / (days.length * hours.length));
    }

}
