package gameplay;
import Players.Player;
import plansza.Board;

public class Gameplay {
    public static void main(String[] args) {
        System.out.println("\n \t Kółko i krzyżyk \n");
        //wczytanie graczy
        Player.input();
        //generowanie planszy
        Board.plansza();
        do {

            Gameplay_background.rozgrywka(Player.player1, 'x');
            Clear_screen.clearscreen();
            Board.plansza();

           if(Endgame.koniec_gry()==false)
           {
               System.exit(0);
           }
            Gameplay_background.rozgrywka(Player.player2, 'o');
            Clear_screen.clearscreen();
            Board.plansza();

        }
        while ((Endgame.koniec_gry()));
    }
}
