package TicTacToe2;

public class Area {
    public static String[][] array = new String[3][3];                  //Создается массив 3 на 3
    public static String a1 = "A1", a2 = "A2", a3 = "A3";
    public static String b1 = "B1", b2 = "B2", b3 = "B3";
    public static String c1 = "C1", c2 = "C2", c3 = "C3";

    public static void completion() {                                   //Метод полностью заполняет массив знаком "-"
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++) {
                 array[i][j] = "-";
            }
        }
    }

    public static void output(String[][] a) {                           //Метод выводит массив сделанный выше
        completion();
        for(int i = 0; i < a.length; i++){
            System.out.print("                     ");
            for(int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mainOutPut() {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
