import java.util.Scanner;
import static java.lang.System.out;

public class MultiplicationTablesGrid 
{
    public static void main(String[] args)    
    {
        Scanner keyboard = new Scanner (System.in);
        int tableSize = 0;
        out.println("Welcome to Multiplication Tables \n");
        out.print("How large would you like your multiplication row? ");
        tableSize = keyboard.nextInt();
        out.println(""); 
        if (tableSize<=20) {
            mTable(tableSize);
        } else {
            out.println("Error, enter number less than 20");
        } 
    }    
    public static void mTable(int tableSize){
        //space for the formatting
        out.printf("    ");
        for(int a=0; a<=tableSize; a++){
            out.printf("%4d" ,a);
        } 
        out.println();        
        for(int a=0; a<=tableSize; a++){
            out.print("");
            out.printf("%4d",a);
            for (int b=0; b<=tableSize; b++){
                out.printf("%4d",a*b);
            } 
            out.println();
        }
    }
}
