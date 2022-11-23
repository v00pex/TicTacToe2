package TicTacToe1;

import java.util.Scanner;

public class Player2 {
    public static String choice;
    public static final String justMessage = "Игрок 2, выберете своего бойца. Введите X или O: ";
    public static String playerMotion;
    public static String cross;
    public static String zero;


    public static String choiceTicOrTac() {                             //Возвращает выбор игрока "Х" или "О"
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine();
        Inside.check1();                                                //Записывает выбор игрока
        return choice;
    }

    public static String motion() {                                     //Возвращает ход игрока
        Scanner scanner = new Scanner(System.in);
        playerMotion = scanner.nextLine();
        return playerMotion;
    }
}
