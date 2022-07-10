package Players;
import java.util.Scanner;

public class Player {
    static Scanner p1= new Scanner(System.in);
    static  Scanner p2= new Scanner(System.in);
    public static String player1;
    public  static  String player2;

    public static  void input()
    {
        System.out.println("Podaj nazwe gracza 1: ");
        player1= p1.nextLine();
        System.out.println(player1+" == X");
        System.out.println("Podaj nazwe gracza 2: ");
        player2=p2.nextLine();
        System.out.println(player2+" == O");
    }
}
