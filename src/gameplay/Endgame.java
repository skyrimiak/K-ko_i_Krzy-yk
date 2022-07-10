package gameplay;

import Players.Player;
import plansza.Board;

public class Endgame {
   static String line = null;
    //make it boolean
    private static boolean sprawdzenie()
    {

        if( line.equals("xxx"))
        {
            System.out.println("Wygrał "+Player.player1);
            System.exit(0);
            return false;


        }
        else if( line.equals("ooo"))
        {
            System.out.println("Wygrał "+Player.player2);
            System.exit(0);
            return false;
        }
        return true;
    }

    public static Boolean koniec_gry()
    {
        for(int a=0;a<8;a++) {
            switch (a){
                case 0:
                    line= Character.toString(Board.a) + Character.toString(Board.b)+ Character.toString(Board.c);
                    if(sprawdzenie()==false)
                        sprawdzenie();
                    break;
                case 1:
                    line=  Character.toString(Board.d) + Character.toString(Board.e)+ Character.toString(Board.f);
                    if(sprawdzenie()==false) sprawdzenie();
                    break;
                case 2:
                    line=  Character.toString(Board.g) + Character.toString(Board.h)+ Character.toString(Board.i);
                    if(sprawdzenie()==false) sprawdzenie();
                    break;
                case 3:
                    line= Character.toString(Board.a) + Character.toString(Board.e)+ Character.toString(Board.i);
                    if(sprawdzenie()==false) sprawdzenie();
                    break;
                case 4:
                    line=  Character.toString(Board.g) + Character.toString(Board.e)+ Character.toString(Board.c);
                    if(sprawdzenie()==false) sprawdzenie();
                    break;
                case 5:
                    line=  Character.toString(Board.a) + Character.toString(Board.d)+ Character.toString(Board.g);
                    if(sprawdzenie()==false) sprawdzenie();
                    break;
                case 6:
                    line=  Character.toString(Board.b) + Character.toString(Board.e)+ Character.toString(Board.h);
                    if(sprawdzenie()==false) sprawdzenie();
                    break;
                case 7:
                    line=  Character.toString(Board.c) + Character.toString(Board.f)+ Character.toString(Board.i);
                    if(sprawdzenie()==false) sprawdzenie();
                    break;

            }

        }

        if (Gameplay_background.licznik==9)
        {
            System.out.println("Nikt nie wygrał!");
            System.exit(0);
        }

        return true;

    }
}
