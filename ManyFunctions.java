import static java.lang.System.out;

/**
 * This assignment has you practice writing functions.  Test cases are provided
 * in code, so when you run the program, it will tell you if the functions
 * are working right.
 * 
 * Instructions
 * 
 * 1. Read all of the code all the way through.
 * 2. Figure out what should be in the _____ areas.  Fix them for all the methods, so the code will compile.
 * 3. Compile the code to check your work on data types and names.
 * 4. Figure out what code belongs in the // TODO areas.  Write that code, one function at a time.
 * 5. Compile and run frequently as you work, noting your progress through the test cases.
 * 6. Keep going until they're all written and the tests cases all pass.
 * 7. Celebrate!
 * 
 */
public class ManyFunctions
{
    /**
     * Takes two integer numbers as input and returns whichever number is smaller.
     */
    public static int minimum(int a, int b)
    {
        // TODO
        if (a>b)
        {
            return b ;
        } else 
        {
            return a;
        }
    }

    /**
     * Takes two integer numbers as input and returns whichever number is larger.
     */
    public static int maximum(int a, int b)
    {
        // TODO
        if (a>b)
        {
            return a ;
        } else 
        {
            return b;
        }
    }

    /**
     * Returns true if the integer input is an odd number (1, 3, 5, 7...)
     */
    public static boolean isOddNumber(int a)
    {
        // TODO
        if (a % 2 == 0) 
        {
            return false;
        } else 
        {
            return true;
        }
    }

    /**
     * Returns true if the integer input is an even number (0, 2, 4, 6, 8...)
     */
    public static boolean isEvenNumber(int a)
    {
        // TODO
        if (a % 2 == 0) 
        {
            return true;
        } else 
        {
            return false;
        }
    }

    /**
     * Returns true if the letter is a vowel, or false otherwise.
     * You can assume only letters are being sent as input (not
     * spaces or punctuation marks or anything else).
     */
    public static boolean isVowel(char a)
    {
        // TODO
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'|| a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';

    }

    /**
     * Returns true if the letter is a consonant, or false otherwise.
     * You can assume only letters are being sent as input (not
     * spaces or punctuation marks or anything else).
     * 
     * This can be written in 1 short line of code without typing out
     * all the consonants in the alphabet.  Can you figure out how?
     */
    public static boolean isConsonant(char a)
    {
        // TODO
        return !isVowel(a);
    }

    /**
     * Runs a series of test cases against the above methods.
     * 
     * *** DO NOT!!!!! CHANGE THE CODE INSIDE main() { }
     * 
     * Just use this as an example of how the methods will be called, so 
     * you can figure out what they are supposed to do.
     * 
     */
    public static void main(String[] args)
    {
        out.println("Testing your functions.");
        int testFailures = 0;

        if (minimum(4, 3) != 3) {
            out.println("Error 1: Minimum failed test.  Expected 3, got " + minimum(4, 3));
            testFailures++;
        }
        if (minimum(4, 4) != 4) {
            out.println("Error 2: Minimum failed test.  Expected 4, got " + minimum(4, 4));
            testFailures++; 
        }
        if (minimum(3, 4) != 3) {
            out.println("Error 3: Minimum failed test.  Expected 3, got " + minimum(3, 4));
            testFailures++; 
        }
        if (minimum(5, 4) != 4) {
            out.println("Error 4: Minimum failed test.  Expected 4, got " + minimum(5, 4));
            testFailures++; 
        }

        if (maximum(4, 3) != 4) {
            out.println("Error 5: Maxmimum failed test.  Expected 4, got " + maximum(4, 3));
            testFailures++; 
        }
        if (maximum(3, 4) != 4) {
            out.println("Error 6: Maxmimum failed test.  Expected 4, got " + maximum(3, 4));
            testFailures++; 
        }
        if (maximum(4, 4) != 4) {
            out.println("Error 7: Maxmimum failed test.  Expected 4, got " + maximum(4, 4));
            testFailures++; 
        }
        if (maximum(-2, 10) != 10) {
            out.println("Error 8: Maxmimum failed test.  Expected 10, got " + maximum(-2, 10));
            testFailures++; 
        }

        if (isEvenNumber(3)) {
            out.println("Error 9: isEven failed test.  Expected isEven(3) to be false, but got true.");
            testFailures++; 
        }
        if (!isEvenNumber(2)) {
            out.println("Error 10: isEven failed test.  Expected isEven(2) to be true, but got false.");
            testFailures++; 
        }
        if (isOddNumber(0)) {
            out.println("Error 11: isOdd failed test.  Expected isOdd(0) to be false, but got true.");
            testFailures++; 
        }
        if (!isOddNumber(5)) {
            out.println("Error 12: isOdd failed test.  Expected isOdd(5) to be true, but got false.");
            testFailures++; 
        }
        if (isOddNumber(18)) {
            out.println("Error 13: isOdd failed test.  Expected isOdd(18) to be false, but got true.");
            testFailures++; 
        }

        if (!isVowel('a')) {
            out.println("Error 14: isVowel failed test.  Expected isVowel('a') to be true, but got false.");
            testFailures++; 
        }
        if (isVowel('x')) {
            out.println("Error 15: isVowel failed test.  Expected isVowel('x') to be false, but got true.");
            testFailures++; 
        }
        if (!isConsonant('z')) {
            out.println("Error 16: isConsonant failed test.  Expected isConsonant('z') to be true, but got false.");
            testFailures++; 
        }
        if (isConsonant('i')) {
            out.println("Error 17: isCononant failed test.  Expect isConsonant('i') to be false, but got true.");
            testFailures++; 
        }
        if (!isConsonant('b')) {
            out.println("Error 18: isConsonant failed test.  Expected isConsonant('b') to be true, but got false.");
            testFailures++; 
        }        
        if (!isConsonant('c')) {
            out.println("Error 19: isConsonant failed test.  Expected isConsonant('c') to be true, but got false.");
            testFailures++; 
        }        
        if (!isConsonant('d')) {
            out.println("Error 20: isConsonant failed test.  Expected isConsonant('d') to be true, but got false.");
            testFailures++; 
        }        
        if (!isConsonant('f')) {
            out.println("Error 21: isConsonant failed test.  Expected isConsonant('f') to be true, but got false.");
            testFailures++; 
        }        
        if (!isConsonant('g')) {
            out.println("Error 22: isConsonant failed test.  Expected isConsonant('g') to be true, but got false.");
            testFailures++; 
        }
        if (!isVowel('A')) {
            out.println("Error 23: isVowel failed test.  Expected isVowel('A') to be true, but got false.");
            testFailures++; 
        }
        if (isVowel('X')) {
            out.println("Error 24: isVowel failed test.  Expected isVowel('X') to be false, but got true.");
            testFailures++; 
        }
        if (!isConsonant('Z')) {
            out.println("Error 25: isConsonant failed test.  Expected isConsonant('Z') to be true, but got false.");
            testFailures++; 
        }
        if (isConsonant('I')) {
            out.println("Error 26: isCononant failed test.  Expect isConsonant('I') to be false, but got true.");
            testFailures++; 
        }

        if (testFailures == 0) {
            out.println("Success!  All test cases passed.");
        } else {
            out.println(testFailures + " tests failed.  Keep trying!");
        }

    }

}