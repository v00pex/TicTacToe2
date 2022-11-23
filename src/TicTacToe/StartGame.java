package TicTacToe;

public class StartGame {
    public static String ticTacToe = "Крестики нолики";
    public static String tic = "❌";
    public static String tac = "⭕";
    public static String settings = "❔ Чтобы сделать ход, необходимо написать следующее:" +
            " ❔\n❔   \"A1\", \"B1\", \"C1\". И так далее по аналогии       ❔\n";
    public static void start() {
        System.out.println("             " + tic + ticTacToe + tac + "\n");
        System.out.println(settings);
        Inside.whoChoiceFirst();
        Inside.whoIsWho();
        Inside.whoGoesFirst();
    }
}
