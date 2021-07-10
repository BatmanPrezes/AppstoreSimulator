import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;



//ujednolicić return po exeption z mismatch -> ma wracać za każdym razem do wyboru poprzedzającego go
//jedna wartość dla wszystkich metod

public class Menu {

    public static int MainMenu() {
        System.out.println("Witaj w Appstore - symulatorze firmy robiącej aplikacje.");
        System.out.println("Wypisz cyfrę oznaczającą, którą czynność chcesz wykonać.");
        System.out.println("1 - Rozpocznij grę jednoosobową.");
        System.out.println("2 - Rozpocznij grę wieloosobową (maks 5 graczy).");
        System.out.println("3 - Wyłącz grę.");


        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            return answer;
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 3;
        }

        // closing the scanner object
        //input.close();
    }

    public static int HowManyPlayers() {
        System.out.println("Wpisz ilość uczestników wypisując cyfrę od 2 do 5.");
        System.out.println("Jeśli chcesz wrócić do głównego menu, wpisz liczbę 0.");

        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            return answer;
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 0;
        }

    }

    public static ArrayList<String> nameYourGamers(int howManyPlayers) {
        System.out.println("Nazwij gracza/y.");
        ArrayList<String> gamers = new ArrayList<String>();

        for (int i = 1; i <= howManyPlayers; i++) {
            System.out.println("Gracz " + i + ":");
            //odpowiedź
            try {
                Scanner input = new Scanner(System.in);
                String answer = input.nextLine();
                gamers.add(answer);
            } catch (InputMismatchException e) {
                System.out.println("Podałeś nazwę w złym formacie");
            }
        }

        return gamers;
    }

    public static int HowManyMovements() {
        System.out.println("Wybierz ile ruchów ma wykonywać gracz na jedną turę.");
        System.out.println("Wypisz liczbę od 3 do 10");

        //odpowiedź
        try {
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (answer >=3 && answer <= 10) {
                return answer;
            }
            else {
                System.out.println("Podałeś nieprawidłową ilość ruchów.");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Podałeś liczbę w złym formacie");
            return 0;
        }

    }
}




