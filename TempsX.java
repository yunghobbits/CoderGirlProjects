import static java.lang.System.out;
import java.util.Scanner;
public class TempsX
{
    public static void main(String[] args)
    {             
        int temps[][] = new int [4][7]; 
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;        
        String time[] = {"7:00 AM: ", "3:00 PM: ", "7:00 PM: ", "3:00 AM: "};
        out.println("~~~~Temperature Calculator~~~~\n"); 
        out.println("The data provided are:"); 
        out.println("         Sun Mon Tue Wed Thu Fri Sat"); 
        for (int row = 0; row<4; row++)
        {
            out.print(time[row]); 
            for (int column = 0; column<7; column++) {   
                out.print(" " + temps[row][column] + " "); 
            }
            out.println();
        }
        out.println("");
        out.println("Based on that data, the following are the average temperatures for the week.\n");                
        //week days
        int sumSun = 0;
        int sumMon = 0;
        int sumTue = 0; 
        int sumWed = 0;
        int sumThu = 0; 
        int sumFri = 0;
        int sumSat = 0;      
        for(int row =0; row<4; row++) {          
            sumSun+= temps[row][0];  
            sumMon+= temps[row][1];            
            sumTue+= temps[row][2];                         
            sumWed+= temps[row][3];                         
            sumThu+= temps[row][4];                         
            sumFri+= temps[row][5];                       
            sumSat+= temps[row][6];            
        }

        int aSun = sumSun/4; 
        out.println("Sun: " + aSun);  
        int aMon = sumMon/4; 
        out.println("Mon: " + aMon);  
        int aTues = sumTue/4; 
        out.println("Tue: " + aTues); 
        int aWed = sumWed/4; 
        out.println("Wed: " + aWed);  
        int aThu = sumThu/4; 
        out.println("Thu: " + aThu);
        int aFri = sumFri/4; 
        out.println("Fri: " + aFri);  
        int aSat = sumSat/4; 
        out.println("Sat: " + aSat);
        //hours        
        int sum7Am =0; 
        int sum7Pm =0; 
        int sum3Am =0; 
        int sum3Pm =0; 
        for (int column = 0; column<7; column++){
            sum7Am+= temps[0][column]; 
            sum3Pm+= temps[1][column]; 
            sum7Pm+= temps[2][column];
            sum3Am+= temps[3][column];
        }
       
        int aSAm = sum7Am/ 7; 
        out.println("\n7:00 AM : " + aSAm); 
        int aTPm = sum3Pm/ 7; 
        out.println("3:00 PM : " + aTPm); 
        int aSPm = sum7Pm/ 7; 
        out.println("7:00 PM : " + aSPm); 
        int aTAm = sum3Am/ 7; 
        out.println("3:00 AM : " + aTAm);

        //overall
        int counter =0;
        int sum = 0;
        for(int row=0;row< temps.length;row++){
            for(int column=0;column<temps[row].length;column++){
                sum = sum+temps[row][column];
                counter++;
            }
        }
        int overall = sum / counter;
        out.println("\nThe final average temperature for the week was:\n");
        out.println("Overall: " + overall);
    }
}
