import static java.lang.System.out;
import java.util.Scanner;
public class TTTcopy
{
    static Scanner keyboard = new Scanner(System.in);
    static char emptyPlacement = '.';
    public static void main(String[] args)
    {
        boolean wantstoplay = true;
        out.println("Welcome to Tic Tac Toe!");
        out.println("To play, enter a number for which box to play in.");
        out.println("1 2 3");
        out.println("4 5 6");
        out.println("7 8 9\n");
        out.println("You'll need a buddy to play with.  Ready to begin?  Here we go.\n");
        //this while loops ask if they want to continue the game.         
        while(wantstoplay)
        {
            game();
            out.println("");
            out.println("Would you like to play again?");
            String anwser = keyboard.nextLine();
            
            if (anwser.equals("yes"))
                wantstoplay = true;
            else
                wantstoplay = false;
                
        }
        
        out.println("~~~~~~~WOOH!~~~~~~~");
        out.println("Thanks for playing! :)");
    }

    public static void game()
    {
        int counter = 0;
        int move = 0;
        int xWins = 0;
        int oWins = 0;
        int draws = 0;
        boolean stillPlaying = true;
        boolean invalidInput = true;
        boolean full = true;
        char[][] gameBoard = createEmptyBoard();
        //empty board being drawn
        drawBoard(gameBoard);
        do {
            //print clear game board
            counter++;
            do{
                if (counter%2==0) {
                    out.print("o where? ");
                } else {
                    out.print("x where? ");
                }
                move = keyboard.nextInt();
                invalidInput = (move < 1 || move > 9);
                if (invalidInput) {
                    System.out.println("Oops! The location, " + move + " is not valid..  Try 1-9.");
                } else {
                    full = (getMarkMove(move, gameBoard) != emptyPlacement);
                    if (full) {
                        System.out.println("Sorry, position " + move + " is already full.  Pick another.");
                    }
                }
            } while (full || invalidInput);
            placeMark(move, gameBoard, counter);           
            drawBoard(gameBoard);
            if (aWin(gameBoard)) {
                stillPlaying = false;
                if (counter%2==0) {
                    oWins++;
                    out.println("Player O wins the game!");
                } else {
                    xWins++;
                    out.println("Player X wins the game!");
                }
            } else if (spotsFull(gameBoard)) {
                stillPlaying = false;
                draws++;
                out.println("The game is a draw.  Nobody wins.");
            } else {
                // board is not full, so continue to next player's turn.
            }
        } while (stillPlaying);
        out.println("Score: player O= " + oWins + ", player X= " + xWins + ", draws= " + draws);
    }

    public static boolean spotsFull(char[][] board) 
    {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == emptyPlacement) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean aWin(char[][] board)
    {
        boolean horizontalWin = false;
        boolean verticalWin = false;
        boolean diagonalWin = false;
        for (int row = 0; row < 3; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                if (board[row][0] != emptyPlacement && board[row][0] == board[row][1] && board[row][1] == board[row][2])
                {
                    return  horizontalWin = true; 
                } else if (board[0][col] != emptyPlacement && board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                    return  verticalWin = true;
                } else if (board[0][0] != emptyPlacement && board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] != emptyPlacement && board[0][2] == board[1][1]&& board[1][1] == board[2][0]){
                    return  diagonalWin = true;
                }               
            }
        }
        return false;
    }

    public static char getMarkMove(int move, char[][] board)
    {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        return board[row][col];
    }

    public static void placeMark(int move, char[][] board, int counter)
    {
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        if (counter%2==0) {
            board[row][col] = 'o';
        } else {
            board[row][col] = 'x';
        }
    }

    public static void drawBoard(char[][] board)
    {
        out.println();
        for (int row = 0; row < 3; row++)
        {
            System.out.println(" " + board[row][0] + " | " + board[row][1] + " | " + board[row][2]);
        }
        out.println();
    }

    public static char[][] createEmptyBoard()
    {
        char[][] gameBoard = new char[3][3];
        for (int row = 0; row < 3; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                gameBoard[row][col] = '.';
            }
        }
        return gameBoard;
    }
}