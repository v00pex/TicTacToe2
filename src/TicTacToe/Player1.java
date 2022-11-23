package TicTacToe;

import java.util.Scanner;

public class Player1 {
    public static String choice;
    public static final String justMessage = "Игрок 1, выберете своего бойца. Введите X или O: ";


    public static String choiceTicOrTac() {
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine();
        Inside.check();
        return choice;
    }
}
