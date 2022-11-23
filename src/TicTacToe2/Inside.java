package TicTacToe2;


public class Inside {
    public static String firstPlayer = "Игрок 1 ходит первым: ";
    public static String secondPlayer = "Игрок 2 ходит первым: ";
    public static String secondMove2 = "Ходит игрок 2: ";
    public static String secondMove1 = "Ходит Игрок 1: ";
    public static boolean peek;
    public static boolean cOz, cOz1;
    public static boolean zeroOrOne;


    public static int randomNumber() {
        return (int)(Math.random() * 2);
    }       //Создается рандомное число 0 или 1

    public static void firstMotion() {
        if(peek && cOz){
            OutPut.crossPlayer1();
        }else if(peek && cOz == false){
            OutPut.zeroPlayer1();
        }else if(peek == false && cOz1 == true){
            OutPut.crossPlayer2();
        }else if(peek == false && cOz1 == false){
            OutPut.zeroPlayer2();
        }
    }

    public static void secondMotion(){
        int count = 0;
        while(count < 8) {
            if (peek) {
                System.out.print(secondMove2);
                Player2.motion();
                if (cOz1) {
                    OutPut.crossPlayer2();
                } else {
                    OutPut.zeroPlayer2();
                }
                peek = false;
                count++;
            } else {
                System.out.print(secondMove1);
                Player1.motion();
                if (cOz) {
                    OutPut.crossPlayer1();
                } else {
                    OutPut.zeroPlayer1();
                }
                peek = true;
                count++;
            }

            if(Victory.victoryIfCross(Area.array)){
                System.out.println("Победа!");
                break;
            }else if(Victory.victoryIfZero(Area.array)){
                System.out.println("Победа!");
                break;
            }
        }
    }

    //Метод определяет чей ход первый
    public static void whoChoiceFirst() {
        if(randomNumber() == 0){                                                 //Если рандомное число равно 0 то первый игрок выбирает первый
            System.out.print(Player1.justMessage);
            Player1.choiceTicOrTac();
            zeroOrOne = true;
//            System.out.println();
        }else{
            System.out.print(Player2.justMessage);
            Player2.choiceTicOrTac();
            zeroOrOne = false;
//            System.out.println();
        }
    }


    public static void mainVerify() {
        if(zeroOrOne){
            Player1.mainVerify();
        }else{
            Player2.mainVerify();
        }
    }

    public static void whoGoesFirst() {                     //Метод который определяет кто ходит первый
        if(randomNumber() == 0){
            peek = true;
            System.out.print(firstPlayer);
            Player1.motion();
        }else{
            peek = false;
            System.out.print(secondPlayer);
            Player2.motion();
        }
    }

    public static void whoIsWho() {
        if (Player2.a || Player1.a) {
            if (Player1.choice == "O") {                         //Если игрок 1 выбрал нолик то
                cOz = false;
                cOz1 = true;
                Player1.zero = StartGame.tac;                   //Игрок 1 играет за нолик а Игрок 2 играет за крестик
                Player2.cross = StartGame.tic;
                System.out.println("Боец Игрока 1 - ⭕");
                System.out.println("Боец Игрока 2 - ❌\n");
            } else {
                cOz = true;
                cOz1 = false;
                Player2.zero = StartGame.tac;
                Player1.cross = StartGame.tic;
                System.out.println("Боец Игрока 1 - ❌");
                System.out.println("Боец Игрока 2 - ⭕\n");
            }
        }
    }

    public static void check() {                    //Если выбор первого игрока нолик то второй игрок автоматически становится крестиком
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
