package DOSA420;

public class Main 
{
    static int[][] genboard;
    public static void main(String args[])    
    {
        Display.homeDisplay();

        switch(Display.userInput())
        {
            case "A":
            case "a":
            genboard=Sudoku.giveBoard();
            Sudoku.printSudoku(genboard);
            break;
            case "B":
            case "b":
            Display.duck();
            switch(Display.userInput())
            {
                case "A":
                case "a":
                GFG.mooain();
                break;
                case "B":
                case "b":
                SuduckoDance();
                break;
                default:
                Main.main(args);
                break;
            }
            break;
            default:
            Display.exit();
            break;
        }
    }
    public static void SuduckoDance()
    {
        Display.duckBT();
    }
}
//System.out.println("\n\n\n...Solving...\n\n\n");