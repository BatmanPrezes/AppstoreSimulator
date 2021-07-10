import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //zmienne konfiguracyjne - może lepiej zmienić je na obiekt? nwm czy zbyt bazodanowo nie myslę xd
        Date startDate = new Date(2020, 1, 1);
        Date today = new Date(2020, 1, 1);
        int dayCounter = 0;
        boolean stop = false;
        int howManyPlayers = 0;

        ArrayList<String> gamers = new ArrayList<String>();
        ArrayList<Project> projects = new ArrayList<Project>();

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

            else if (gamers == null) {
                int miniLoop = 0;

                while (miniLoop == 0) {
                    gamers = Menu.nameYourGamers(howManyPlayers);
                    System.out.println(gamers);
                    if (gamers.size() == howManyPlayers) {
                        System.out.println(gamers.size() + " = " + howManyPlayers);
                        miniLoop = 1;
                    } else {
                        System.out.println("Nie zgadza się ilość nazwanych graczy. Proszę ponów akcję.");
                    }

                }
            }
            else if (movementsPerRound == 0) {
                while (movementsPerRound == 0) {
                    movementsPerRound = Menu.HowManyMovements();
                }

            }

            else
            {


                for(int i = 0; i<howManyPlayers; i++)
                {
                    if(projects == null || projects.size() != howManyPlayers)
                    {

                    }

                    for(int j = 0; j<movementsPerRound; j++)
                    {

                    }
                }



                stop = true;
            }


    }

}
}
