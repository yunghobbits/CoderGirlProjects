import static java.lang.System.out;

public class TemperatureCal {
    public static void main(String[] args) {
        int temp[][] = {{68, 70, 76, 70, 68, 71, 75}, {76, 76, 87, 84, 82, 75, 83}, {73, 72, 81, 78, 76, 73, 77}, {64, 65, 69, 68, 70, 74, 72}};
        String time[] = {"7:00 AM", "3:00 PM", "7:00 PM", "3:00 AM"};
        String days[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int timeSumArr[] = new int[4];
        int daySumArr[] = new int[7];
        int sumOfHours = 0, sumOfDays = 0, totalSum = 0;

        out.println("Temperature Calculator \n");
        out.println("The data provided are:");

        for (int row = 0; row < time.length; row++) {
            out.print(time[row] + ": ");
            int column;
            for (column = 0; column < days.length; column++) {
                sumOfHours += temp[row][column];
                out.print(column == 6 ? temp[row][column] : temp[row][column] + ", ");

            }
            timeSumArr[row] = (sumOfHours / (column));
            sumOfHours = 0;
            out.println();
        }

        for (int column = 0; column < days.length; column++) {
            for (int row = 0; row < time.length; row++) {
                sumOfDays += temp[row][column];
                totalSum += temp[row][column];
            }
            daySumArr[column] = sumOfDays / time.length;
            sumOfDays = 0;
        }
        out.println("\nBased on that data, the following are the average temperatures for the week. \n");
        chartDisplayed(days, daySumArr);
        chartDisplayed(time, timeSumArr);
        out.println("The final average temperature for the week was:\n");
        out.println("Overall: " + (totalSum / (days.length * time.length)));
    }

    public static void chartDisplayed(String printArray[], int sumArr[]) {
        for (int i = 0; i < printArray.length; i++) {
            out.println(printArray[i] + ": " + (sumArr[i]));
        }
        out.println();
    }
}
