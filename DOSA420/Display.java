package DOSA420;

import java.util.Objects;
import java.util.Scanner;

public class Display {
    static Scanner sc = new Scanner(System.in);

    public static void homeDisplay() {
        System.out.println("\n" + ConsoleColors.BigSpace + ConsoleColors.RESET + "");
        System.out.println(ConsoleColors.BigSpace + "A. Generate new random board");
        System.out.println(ConsoleColors.BigSpace + "B. Solve a random board");
    }

    //backtracking algorithm
    public static void duck() {
        System.out.println("\n" + ConsoleColors.BigSpace + ConsoleColors.RESET + "");
        System.out.println(ConsoleColors.BigSpace + "A. Backtrack");
        System.out.println(ConsoleColors.BigSpace + "B. Dance");
    }

    public static void duckBT() {
        System.out.println("\n" + ConsoleColors.BigSpace + ConsoleColors.RESET + "");
        System.out.println(ConsoleColors.BigSpace + "A. Manual Entry");
        System.out.println(ConsoleColors.BigSpace + "B. Random gen");
    }
    public static String userInput() {
        System.out.print(ConsoleColors.BigSpace + "Waiting for user input... : ");
        return sc.nextLine();
    }

    public static void showKey(String key) {
        System.out.println(ConsoleColors.BigSpace + ConsoleColors.CYAN_BACKGROUND + ConsoleColors.BLACK + " " + "Key: " + key + " " + ConsoleColors.RESET);
    }

    public static void encryptedOrDecrypted(String cipherMode) {
        System.out.println("  " + ConsoleColors.GREEN_BACKGROUND + ConsoleColors.BLACK + " DONE!  " + (Objects.equals(cipherMode, "Encrypt") ? "File Encrypted Successfully! " : "File Decrypted Successfully! ") + ConsoleColors.RESET);
    }

    public static void fileException() {
        System.out.println(ConsoleColors.BigSpace + ConsoleColors.RED_BACKGROUND + ConsoleColors.BLACK + " Invalid file input! " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.BigSpace + ConsoleColors.RED_BACKGROUND + ConsoleColors.BLACK + " Process reverted! " + ConsoleColors.RESET);
    }

    public static void exit() {
        System.out.print(ConsoleColors.BigSpace + ConsoleColors.RED_BACKGROUND + ConsoleColors.BLACK + " Exiting! " + ConsoleColors.RESET + "\n");
        System.exit(0);
    }
}
