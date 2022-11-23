package TicTacToe;

import java.util.Scanner;

public class Player2 {
    public static String choice;

    public static final String justMessage = "Игрок 2, выберете своего бойца. Введите X или O: ";


    public static String choiceTicOrTac() {
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine();
        Inside.check1();
        return choice;
    }
}
