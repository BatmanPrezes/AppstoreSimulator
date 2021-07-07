import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //zmienne konfiguracyjne - może lepiej zmienić je na obiekt? nwm czy zbyt bazodanowo nie myslę xd
        Date startDate = new Date(2020, 1, 1);
        int dayCounter = 0;
        boolean stop = false;
        int howManyPlayers = 0;
        ArrayList<String> gamers = new ArrayList<String>();

        int movementsPerRound = 0; //użytkownik będzie sam wybierać od 3 do 10?

        //pętla główna gry
        while (stop == false)
        {
            //warunek kiedy wchodzi do głównego menu, a kiedy nie
            if (howManyPlayers == 0)
            {
                int answer = Menu.MainMenu();

                System.out.println(answer);

                if (answer == 1) {
                    System.out.println("Tu będzie ustawienie graczy na 1");
                    howManyPlayers = 1;
                } else if (answer == 2) {
                    System.out.println("Tu będzie ustawienie graczy na wybraną liczbę do 5");
                    howManyPlayers = Menu.HowManyPlayers();
                    if (howManyPlayers == 0) {
                        continue;
                    }

                } else if (answer == 3) {
                    System.out.println("Tu będzie wybór tak nie.");
                    stop = true;
                }

            }

            else
            {   System.out.println("Podaj nazwę gracza/y.");
                gamers = Menu.nameYourGamers(howManyPlayers);
                System.out.println(gamers);
                if(gamers.length != howManyPlayers)
                stop = true;
            }


    }

}
}
