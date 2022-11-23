package TicTacToe2;

public class StartGame {
    public static String ticTacToe = "Крестики нолики";
    public static String tic = "❌";
    public static String tac = "⭕";
    public static String settings = "❔ Чтобы сделать ход, необходимо написать следующее:" +
            " ❔\n❔   \"A1\", \"B1\", \"C1\". И так далее по аналогии       ❔\n❔              Так выглядит поле                    ❔";
    public static String defis = "------------------------------------------------------";


    public static void start() {                                                //Метод запуска игры
        System.out.println("             " + tic + ticTacToe + tac + "\n");     //Название игры
        System.out.println(defis);
        System.out.println(settings);                                           //Правила игры
        Area.output(Area.array);                                                //Показ игрового поля
        System.out.println(defis);
        Inside.whoChoiceFirst();                                                //Чей выбор первый
        Inside.mainVerify();
        Inside.whoIsWho();                                                      //Показывает у кого крестик а у кого нолик
        Inside.whoGoesFirst();                                                  //Кто ходит первым
        Inside.firstMotion();
        Inside.secondMotion();
        Victory.victoryIfCross(Area.array);
    }
}
