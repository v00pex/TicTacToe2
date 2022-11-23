package TicTacToe;


public class Inside {
    public static String firstPlayer = "Игрок 1 ходит первым";
    public static String secondPlayer = "Игрок 2 ходит первым";


    public static int randomNumber() {
        return (int)(Math.random() * 2);
    }
    public static void whoChoiceFirst() {
        if(randomNumber() == 0){
            System.out.print(Player1.justMessage);
            Player1.choiceTicOrTac();
            System.out.println();
        }else{
            System.out.print(Player2.justMessage);
            Player2.choiceTicOrTac();
            System.out.println();
        }
    }

    public static void whoGoesFirst() {
        if(randomNumber() == 0){
            System.out.println(firstPlayer + "\n");
        }else{
            System.out.println(secondPlayer + "\n");
        }
    }

    public static void whoIsWho() {
        if(Player1.choice == "O") {
            System.out.println("Боец Игрока 1 - ⭕");
            System.out.println("Боец Игрока 2 - ❌\n");
        } else {
            System.out.println("Боец Игрока 1 - ❌");
            System.out.println("Боец Игрока 2 - ⭕\n");
        }
    }

    public static void check() {
        if(Player1.choice == "O"){
            Player2.choice = "X";
        }else{
            Player2.choice = "O";
        }
    }

    public static void check1() {
        if(Player2.choice == "O"){
            Player1.choice = "X";
        }else{
            Player1.choice = "O";
        }
    }
}
