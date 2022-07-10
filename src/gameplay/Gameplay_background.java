package gameplay;

import Players.Player;
import plansza.Board;

import java.util.Scanner;

public class Gameplay_background {
    static public int licznik=0;


    static public void rozgrywka(String p, char znak) {
        Scanner scan = new Scanner(System.in);
        boolean b = false;


        {
            do {
                System.out.println("Player "+ p+" musi podać literkę pola: ");
                Board.pole= scan.next().charAt(0);

                switch (Board.pole)
                {
                    case 'a':
                        Board.a=znak;
                        licznik++;
                    break;
                    case 'b':
                        Board.b=znak;
                        licznik++;
                        break;
                    case 'c':
                        Board.c=znak;
                        licznik++;
                        break;
                    case 'd':
                        Board.d=znak;
                        licznik++;
                        break;
                    case 'e':
                        Board.e=znak;
                        licznik++;
                        break;
                    case 'f':
                        Board.f=znak;
                        licznik++;
                        break;
                    case 'g':
                        Board.g=znak;
                        licznik++;
                        break;
                    case 'h':
                        Board.h=znak;
                        licznik++;
                        break;
                    case 'i':
                        Board.i=znak;
                        licznik++;
                        break;


                        default:
                        System.out.println("Nie ma takiego pola!");
                        continue;



                }
b=true;
            } while (!b == true);
        }
    }
}
