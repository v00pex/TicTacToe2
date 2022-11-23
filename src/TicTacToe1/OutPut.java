package TicTacToe1;

public class OutPut {
    public static String a1 = "A1", a2 = "A2", a3 = "A3";
    public static String b1 = "B1", b2 = "B2", b3 = "B3";
    public static String c1 = "C1", c2 = "C2", c3 = "C3";

    public static void crossPlayer1() {                                                         //Метод который ставит крестик Игрока 1 туда куда надо
        if(Player1.playerMotion.equals(a1) && Player1.cross.equals(StartGame.tic)){
            Area.array[0][0] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(a2) && Player1.cross.equals(StartGame.tic)){
            Area.array[1][0] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(a3) && Player1.cross.equals(StartGame.tic)){
            Area.array[2][0] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(b1) && Player1.cross.equals(StartGame.tic)){
            Area.array[0][1] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(b2) && Player1.cross.equals(StartGame.tic)) {
            Area.array[1][1] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(b3) && Player1.cross.equals(StartGame.tic)) {
            Area.array[2][1] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(c1) && Player1.cross.equals(StartGame.tic)) {
            Area.array[0][2] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(c2) && Player1.cross.equals(StartGame.tic)) {
            Area.array[1][2] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(c3) && Player1.cross.equals(StartGame.tic)) {
            Area.array[2][2] = StartGame.tic;
            Area.mainOutPut();
        }
    }

    public static void crossPlayer2() {                                                      //Метод который ставит крестик Игрока 2 туда куда надо
        if(Player2.playerMotion.equals(a1) && Player2.cross.equals(StartGame.tic)){
            Area.array[0][0] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(a2) && Player2.cross.equals(StartGame.tic)){
            Area.array[1][0] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(a3) && Player2.cross.equals(StartGame.tic)){
            Area.array[2][0] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(b1) && Player2.cross.equals(StartGame.tic)){
            Area.array[0][1] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(b2) && Player2.cross.equals(StartGame.tic)) {
            Area.array[1][1] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(b3) && Player2.cross.equals(StartGame.tic)) {
            Area.array[2][1] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(c1) && Player2.cross.equals(StartGame.tic)) {
            Area.array[0][2] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(c2) && Player2.cross.equals(StartGame.tic)) {
            Area.array[1][2] = StartGame.tic;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(c3) && Player2.cross.equals(StartGame.tic)) {
            Area.array[2][2] = StartGame.tic;
            Area.mainOutPut();
        }
    }

    public static void zeroPlayer1() {                                                          //Метод который ставит нолик Игрока 1 туда куда надо
        if(Player1.playerMotion.equals(a1) && Player1.zero.equals(StartGame.tac)){
            Area.array[0][0] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(a2) && Player1.zero.equals(StartGame.tac)){
            Area.array[1][0] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(a3) && Player1.zero.equals(StartGame.tac)){
            Area.array[2][0] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(b1) && Player1.zero.equals(StartGame.tac)){
            Area.array[0][1] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(b2) && Player1.zero.equals(StartGame.tac)) {
            Area.array[1][1] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(b3) && Player1.zero.equals(StartGame.tac)) {
            Area.array[2][1] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(c1) && Player1.zero.equals(StartGame.tac)) {
            Area.array[0][2] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(c2) && Player1.zero.equals(StartGame.tac)) {
            Area.array[1][2] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player1.playerMotion.equals(c3) && Player1.zero.equals(StartGame.tac)) {
            Area.array[2][2] = StartGame.tac;
            Area.mainOutPut();
        }
    }

    public static void zeroPlayer2() {                                                  //Метод который ставит нолик Игрока 2 туда куда надо
        if(Player2.playerMotion.equals(a1) && Player2.zero.equals(StartGame.tac)){
            Area.array[0][0] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(a2) && Player2.zero.equals(StartGame.tac)){
            Area.array[1][0] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(a3) && Player2.zero.equals(StartGame.tac)){
            Area.array[2][0] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(b1) && Player2.zero.equals(StartGame.tac)){
            Area.array[0][1] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(b2) && Player2.zero.equals(StartGame.tac)) {
            Area.array[1][1] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(b3) && Player2.zero.equals(StartGame.tac)) {
            Area.array[2][1] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(c1) && Player2.zero.equals(StartGame.tac)) {
            Area.array[0][2] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(c2) && Player2.zero.equals(StartGame.tac)) {
            Area.array[1][2] = StartGame.tac;
            Area.mainOutPut();
        }else if(Player2.playerMotion.equals(c3) && Player2.zero.equals(StartGame.tac)) {
            Area.array[2][2] = StartGame.tac;
            Area.mainOutPut();
        }
    }
}
