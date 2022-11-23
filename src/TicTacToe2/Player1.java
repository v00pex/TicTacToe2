package TicTacToe2;

import java.util.Scanner;

public class Player1 {
    public static String choice;
    public static final String justMessage = "Игрок 1, выберете своего бойца. Введите X или O: ";
    public static String playerMotion;
    public static String cross;
    public static String zero;
    public static boolean crossOrZero;
    public static boolean isCrossOrZero;
    public static boolean a;



    public static String choiceTicOrTac() {                         //Возвращает выбор игрока "Х" или "О"
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextLine();
        Inside.check();                                             //Записывает выбор игрока
        return choice;
    }

    public static String motion() {                                 //Возвращает ход игрока
        Scanner scanner = new Scanner(System.in);
        playerMotion = scanner.nextLine();
        return playerMotion;
    }

    public static boolean verify() {                                   //Проверяет правильность написания
        if(choice.equals("O") || choice.equals("X")){
            isCrossOrZero = true;
        }else{
            isCrossOrZero = false;
        }
        return isCrossOrZero;
    }

    public static void mainVerify() {
        verify();
        while(true) {
            if (!isCrossOrZero) {
                System.out.print("Неверный символ попробуйте снова: ");
                choiceTicOrTac();
                if (choice.equals("0") || choice.equals("X")) {
                    break;
                }
            }else{
                a = true;
            }
        }
    }

    public static boolean peek() {
        if(choice.equals("X")){
            crossOrZero = true;
        }else{
            crossOrZero = false;
        }
        return crossOrZero;
    }


}
