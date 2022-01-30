package DOSA420;
import java.io. * ;
import java.util.Scanner;
public class CSVReader {
  public static int[][] readCSV() throws Exception {
    Scanner sc = new Scanner(new File("C:\\Users\\adity\\OneDrive\\Desktop\\sss.csv"));
    //parsing a CSV file into the constructor of Scanner class 
    sc.useDelimiter(" ");
    //setting comma as delimiter pattern
    int readBoard[][]=new int[9][9];
    String s="";
    while (sc.hasNext()) {
      s+=sc.next();
    }
    //s = s.replaceAll("[\\n]", "");
    //System.out.println(s);
    int pos=0;
    for(int i=0;i<9;i++)
    {
      for(int j=0;j<9;j++)
      {
        readBoard[i][j]=(int)Character.getNumericValue(s.charAt(pos));
        //System.out.print(readBoard[i][j]);
        pos+=1;
      }
    }
    //System.out.println(readBoard[0][0]);
    //Sudoku.printSudoku(readBoard);
    return readBoard;
    //closes the scanner  
  }
}
